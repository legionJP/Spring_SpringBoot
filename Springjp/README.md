# Sping Framework 


# Topics to be Explore in the Below Order:

1. Spring Project Creation Using the maven 

#### Spring XML Configuration 
2. [Spring Bean XML Config ](pom.xml)

#
# Creating the Spring Project wiht XML config

### Object Creation in the Spring 

3. [Object creation using the ClassPathXmlApplicationContext](src/main/java/com/jspring6/App.java)

### Scopes of the Object Creation

4. [Scope of Object for the Bean in .xml](src/main/java/com/jspring6/App.java)
- see the AlienSpring.java and Laptop.java as well 

### Setter Injection 

5. [Assign the Value using the Bean setter injection property](src/main/java/com/jspring6/App.java) 

[xml file](src/main/resources/spring.xml)

### Ref attribute Injection

6. [ Object injection using the Ref Attribute property](src/main/java/com/jspring6/AlienSpring.java) , [concept ](src/main/java/com/jspring6/App.java) 


### Constructor Injection 

7. [Constructor Values injection ](src/main/java/com/jspring6/ConstructorInjection.java)

### Creating Interface 

8. [Creating the Interface ](src/main/java/com/jspring6/AlienInterface.java) , [Implementing interface](src/main/java/com/jspring6/Desktop.java)

### Autowiring Interface

9. [Autowiring the Interface obj in the dependent class](src/main/java/com/jspring6/AlienInterface.java), [xml file](src/main/resources/spring.xml)

### Primary Bean Type

10. [primary Bean Type](src/main/java/com/jspring6/AlienInterface.java)

### Lazy Initialization of Bean

11. [Lazy bean init and eager bean ](src/main/java/com/jspring6/LazyInitBean.java)

### getBean by Type

12. [getBean by the Class Type obj](src/main/java/com/jspring6/LazyInitBean.java)

### Inner Bean

13. [Creating the Inner Bean for the Particular Class ](src/main/java/com/jspring6/LazyInitBean.java)


#

# Creating the Spring Application Using "Java Based Config"

1. [Injecting obj using Java based Annotation Config](src/main/java/com/jspring6/javabasedconfig/AppConfig.java)

2. [@Bean name in java Based Config](src/main/java/com/jspring6/javabasedConfigBeanName.java)

### Scope Annotation and Prototype Bean 
3. [Scope Annotation](src/main/java/com/jspring6/ScopeAnnottion.java)

    -Class file ref: [App.java](src/main/java/com/jspring6/App.java) , [AppConfig](src/main/java/com/jspring6/javabasedconfig/AppConfig.java)

### Autowire in Config Based Bean ..

4. [autowire]()