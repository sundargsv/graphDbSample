package com.sundar.graphdbDemo.repository;

import com.sundar.graphdbDemo.model.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Collection;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@Repository
public interface UserRepository extends Neo4jRepository<User, Long>{

    //get user by name with relation with movie ratings
    @Query("MATCH (u:User)<-[r: RATED]-(m: Movie) WHERE u.name = $0 RETURN u,r,m")
    User getByUserName(String name);

    //get all users with relation with movie ratings
    @Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
    Iterable<User> getAllUsers();

    //get only user details
    @Query("MATCH (u:User) RETURN u")
    Iterable<User> getOnlyUsers();


}
