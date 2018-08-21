# Java后台开发练习实测
* 本项目用于Java后台开发实训, 目标是评估候选人的相关技术水平, 逻辑思维, 自学能力, 动手解决问题能力等等综合素质

# 需求描述
开发一个图书列表查询页面
* 图书属性包括: 书名/作者/ISBN号
* 通过表格展示系统里的图书
* 需要支持的操作: 借出/归还
    * 借出的图书不能再次借出, 必须归还后才能再次借出

# 第一阶段目标, 准备开发环境, 把项目工程跑起来:
* 安装软件:
    * [JAVA 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
    * [Intellj IDEA](https://www.jetbrains.com/idea/download)
    * [MySQL 5.7](https://dev.mysql.com/downloads/mysql/5.7.html#downloads)
    * [Gradle 2.4](https://gradle.org/next-steps/?version=2.14.1&format=bin)
    * Git
    * 框架工程(https://github.com/hank-cp/training_room)
* Pull框架工程到本地
  * Folk本Repository
  * `git clone git@github.com:{your_name}/training_room.git`
  * [需要在本地先配置好SSH-KEY](https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/)
* 导入IDEA
  * Import Project
  * 选择Gradle
  * 下载依赖包的过程可能要翻墙
* 运行
  * 点绿色三角"运行"按钮, 弹出Run/Debug Configuration框
  * 点左上"+"号, 选择Spring Boot
  * 选择MainClass, 应该只会有一个类在列表中, 选择确认
  * 点"OK"
  * 点绿色三角"运行"按钮, 观察运行日志
  * 打开http://localhost:8080 访问本地环境
  * 可以直接往数据库插测试数据调试程序
  
# 第二阶段, 理解需求, 建模, 实现后台业务逻辑:
* 根据需求设计领域对象, 自动生成数据库表
* 实现配套的Repository, 在Repository中实现对Model的CRUD
* 实现Controller, 在Controller中实现对Model的业务操作

# 第三阶段, 界面UI:
* 参考例子实现
* 可以适当改良优化, 使界面尽量看起来美观

# 参考文档
* jQuery: https://api.jquery.com/
* JqGrid
   * Docs: http://www.trirand.com/jqgridwiki/doku.php?id=wiki:jqgriddocs
   * Demo: http://www.trirand.com/blog/jqgrid/jqgrid.html
   * Demo(Bootstrap): http://www.guriddo.net/demo/bootstrap/
   * New Docs: http://www.guriddo.net/documentation/guriddo/javascript/
* Bootstrap:
   * 官方Docs: http://getbootstrap.com/css/
* Freemarker: http://freemarker.org/docs/ref.html
* Spring Core: http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/
* Spring Boot: http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/
* Spring Boot 参考配置: http://docs.spring.io/spring-boot/docs/1.2.8.RELEASE/reference/htmlsingle/#appendix
* Spring Data: http://docs.spring.io/spring-data/jpa/docs/1.8.2.RELEASE/reference/html/
* JPA (Hibernate): http://docs.jboss.org/hibernate/entitymanager/3.6/reference/en/html/
