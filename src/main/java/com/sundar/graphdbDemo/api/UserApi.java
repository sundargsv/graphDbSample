package com.sundar.graphdbDemo.api;

import com.sundar.graphdbDemo.model.User;
import com.sundar.graphdbDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@RestController
@RequestMapping("/graphdb/user")
@Slf4j
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping
    public Flux<User> getAll(){
        log.info("Getting all users");

        return userService.getAll();
    }

    @GetMapping(path = "/{name}")
    public Mono<User> getByName(@PathVariable("name") String name){
        log.info("Getting user details for a given user name: {}", name);

        return userService.getByName(name);
    }
}
