package com.atsoa.trainingroom.controller;

import com.atsoa.trainingroom.model.User;
import com.atsoa.trainingroom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

import static com.atsoa.trainingroom.util.CollectionUtil.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/list")
    public String index() {
        return "/user";
    }

    @RequestMapping(value = "/list/data", method = RequestMethod.GET)
    @Transactional(readOnly = true)
    public @ResponseBody Map<String, Object> listData(@RequestParam int page, @RequestParam int rows,
                                                      @RequestParam String sord, @RequestParam String sidx,
                                                      @RequestParam Optional<String> username) {
        PageRequest pageRequest = new PageRequest(page-1, rows,
                sord.equals("asc") ? Sort.Direction.ASC : Sort.Direction.DESC,
                !StringUtils.isEmpty(sidx) ? sidx : "id");

        Specifications<User> spec = Specifications
                .where((root, query, cb) ->
                        StringUtils.isEmpty(username) ? cb.like(root.get("username"), "%"+username+"%") : null);

        Page<User> pageData = userRepository.findAll(spec, pageRequest);
        return map(
                entry("total", pageData.getTotalPages()),
                entry("page", pageData.getNumber()+1),
                entry("records", pageData.getTotalElements()),
                entry("rows", pageData.getContent())
        );
    }

    @RequestMapping(value = "/enable/{userId}", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> enable(@PathVariable Long userId) {
        User entity = userRepository.findOne(userId);
        entity.disabled = false;
        userRepository.save(entity);
        return map(
                entry("ret", 0)
        );
    }

    @RequestMapping(value = "/disable/{userId}", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> disable(@PathVariable Long userId) {
        User entity = userRepository.findOne(userId);
        entity.disabled = true;
        userRepository.save(entity);
        return map(
                entry("ret", 0)
        );
    }

}
