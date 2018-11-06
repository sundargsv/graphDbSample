package com.sundar.graphdbDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author Sundar Gsv
 * @Date 06/11/18
 * @ClassDescription
 */
@Data
@ToString
@NoArgsConstructor
@NodeEntity
public class Movie {

    @Id
    private Long id;
    private String title;
    private String director;

}
