package com.sundar.graphdbDemo.service;

import com.sundar.graphdbDemo.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@Service
public interface UserService {

    Mono<User> getByName(String name);
    Flux<User> getAll();
}
