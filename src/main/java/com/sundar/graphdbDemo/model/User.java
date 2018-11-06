package com.sundar.graphdbDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@Data
@ToString
@NoArgsConstructor
@NodeEntity
public class User {

    @Id
    private Long id;
    private String name;
    private Integer age;

    @Relationship(type = "RATED", direction = Relationship.INCOMING)
    private List<Movie> movies;


}
