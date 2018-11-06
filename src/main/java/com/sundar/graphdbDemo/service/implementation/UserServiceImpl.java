package com.sundar.graphdbDemo.service.implementation;

import com.sundar.graphdbDemo.exceptions.NotFound;
import com.sundar.graphdbDemo.model.User;
import com.sundar.graphdbDemo.repository.UserRepository;
import com.sundar.graphdbDemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> getByName(String name) {
        return Mono.just(name).flatMap(userName -> {
            return Mono.just(userRepository.getByUserName(userName));
        })
                .log()
                .switchIfEmpty(Mono.error(new NotFound(String.format("User details not found for a given name %s", name))));

    }

    @Override
    public Flux<User> getAll() {

        return Flux.fromIterable(userRepository.getAllUsers())
                .log()
                .switchIfEmpty(Mono.error(new NotFound("The user collection is empty, No user nodes found")));

    }
}
