# Spring DataJPA


# 1. ORM AND JPA

# 2. Creating Table and Inserting Data using the JPA

### 2.1 Connecting to DB using JPA repository

- [Student Model](src/main/java/com/jspring6/springdatajpaproject/model/Student.java)
- [Repo Class](src/main/java/com/jspring6/springdatajpaproject/StudentRepo.java)
- [ DB Connection Config. ](src/main/resources/application.properties)
- 

```java
// setting up the student Model 

@Component
@Scope("prototype")

@Entity
public class Student {

    @Id
    private int rollno;
    private String name;
    private int marks;
}
    
// getter setters     
    
```
### 2.2 Fetching all objects  
