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

```java

  System.out.println(repo.findAll());

          System.out.println(repo.findAll());

// find By ID
          System.out.println(repo.findById(101));

  // Student sfind = repo.findById(104);  // give the error of null pointer
  // Optional<Student> sfind = repo.findById(104);
  Optional<Student> sfind = repo.findById(103);
        System.out.println(sfind.orElse(new Student())); // get the other new obj if no data

```

### 2.3  DSL Query 

- [DSL Query](src/main/java/com/jspring6/springdatajpaproject/StudentRepo.java)
```java

        // new method by using the query annotation
      // using the class name and property nam in JPA
        @Query("select s from Student s where s.name= ?1")  // ? is for the 1st parameter
        List<Student> findByStudentName(String name);

        //   //DSL Query ,  By default the JPA will implement the query for below things like :
        List<Student> findByName(String name);
        List<Student> findByMarks(int marks);
        List<Student> findByMarksGreaterThan(int marks);
        List<Student> findByNameAndMarks(String name, int marks);
    }
```

```java

//search By Name
        // using the @Query annotation
        System.out.println(repo.findByStudentName("John"));
        // using the DSL query
        System.out.println(repo.findByStudentName("Jane"));
        System.out.println(repo.findByMarksGreaterThan(30));
        System.out.println(repo.findByMarks(23));
```


### 2.3 Update and Delete 


```java

// Update and Delete

        s3.setRollno(103);
        s3.setName("JP");
        s3.setMarks(99);
        repo.save(s3);

        repo.delete(s3);

```

### 3. JPA in Web APP
###  [JPA in job app ](Spring_Boot/SpringBootRest)
```java

```