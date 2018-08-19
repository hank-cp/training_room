package com.atsoa.trainingroom.repository;

import com.atsoa.trainingroom.model.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends
        PagingAndSortingRepository<User, Long>,
        JpaSpecificationExecutor<User> {

}
