## A Spring boot webflux + graph db+ neo4j sample

- Spring boot 2
- Spring webflux (Reactor)
- Spring lombak
- Spring neo4j

### Run below cypher create query to create a data 

```
//User, Movie and the relationship with them

CREATE (Inception:Movie {title: 'Inception', director: 'Chris'})
CREATE (Avatar:Movie {title: 'Avatar', director: ‘James’})

CREATE (Sundar:User {name: 'Sundar', age: 25})
CREATE (Alex:User {name: ‘Alex’, age: 23})
CREATE (Bob:User {name: ‘Bob’, age: 12})

CREATE
(Inception)-[:RATED {rating: 9}]->(Sundar),
(Inception)-[:RATED {rating: 9}]->(Alex),
(Sarkar)-[:RATED {rating: 10}]->(Sundar),
(Sarkar)-[:RATED {rating: 9}]->(Alex)

;

```  
   
### Run below cypher match query to fetch data
```
MATCH (u:User)<-[r: RATED]-(m: Movie) RETURN  u, r, m
MATCH (u:User) RETURN u
MATCH (m:Movie) RETURN m

MATCH (u:User) WHERE u.name = "Sundar" RETURN u;

MATCH (u:User)<-[r: RATED]-(m: Movie) WHERE u.name = "Sundar" RETURN u,r,m;
```      