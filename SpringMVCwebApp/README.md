# Spring MVC Web APP 

```markdown
- We have to use the tomcat externally and for the tomcat 10 we 
- need to use the Jakarta , instead of the javax 
```

## 1. Dependency for Spring MVC Project 

```markdown
 - add the below dependencies in the pom.xml
    ## 1.  Spring web MVC -- version
```

#  2. Running the Tomcat for IDE (IntelliJ)

```markdown
- Set up the Tomcat Server from the Settings 
- Edit the Configuration from service option in the IJ 
```

# 3. Dispatcher servlet 
```markdown
- to call the Controller 
- Tomcat as the servlet container , responsible to run the server 
- In Spring there is multiContainer 
- request goes  first to the frontController and then to the desired Controller 
- Spring has the Dispatcher servlet and , and you have to configure , 
- so tomcat send the request to Dispatcher servlet called the web.xml 

```
### WEB.XML file for  Dispatcher servlet config.

- [Web.xml File](src/main/webapp/WEB-INF/web.xml)

```xml

<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
  <servlet>
     <servlet-name>jspring6</servlet-name>
    <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  </servlet>
  
  <servlet-mapping>
    <servlet-name>jspring6</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
</web-app>

```
#  4. Resolve the Error for Dispatch Servlet  

- Have to create the [/WEB-INF/jspring6-servlet.xml] to configure the servlet 

### Error 
```markdown
Root Cause

org.springframework.beans.factory.BeanDefinitionStoreException: IOException parsing XML document from ServletContext resource [/WEB-INF/jspring6-servlet.xml]

Root Cause

java.io.FileNotFoundException: Could not open ServletContext resource [/WEB-INF/jspring6-servlet.xml]
org.springframework.web.context.support.ServletContextResource.getInputStream(ServletContextResource.java:165)
```

# 5. Configuring the Dispatcher Servlet file : 
 - add the file  'jspring6-servlet.xml' , in the webapp/WEB-INF/

- [jspring6-servlet.xml file](src/main/webapp/WEB-INF/jspring6-servlet.xml)

```xml

<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:ctx="http://www.springframework.org/schema/context"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:mvc="http://www.springframework.org/schema/mvc"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/mvc
       http://www.springframework.org/schema/mvc/spring-mvc.xsd
       http://www.springframework.org/schema/context
       http://www.springframework.org/schema/context/spring-context.xsd">
    <ctx:component-scan base-package="com.jspring6"/>
    <ctx:annotation-config/>

</beans>

<!-- We don't have to do the mapping in the xml if the mapping is done
 in the controller or in the class file
 -->

```

# 6 View Resolver Error 
- Getting error for not founding the View 
- at http://localhost:8080/SpringMVCwebApp_war/home bcz the method returns 
- the index.jsp 
- we have to resolve it by using the view resolver 

```markdown
HTTP Status 404 – Not Found
Type Status Report

Message No endpoint GET /SpringMVCwebApp_war/index.

Description The origin server did not find a current representation for the target resource or is not willing to disclose that one exists.

Apache Tomcat/10.1.34
```

# 7. Configure Internal Resource View Resolver 
- Dispatch server is not able to find the jsp file 
- adding the bean in the resolver to solve it
- [Config file ](src/main/webapp/WEB-INF/jspring6-servlet.xml)

```xml
 <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/views/"></property>
        <property name="suffix" value=".jsp"></property>
    </bean>
```
- add the isELIgnored="false" for getting the values as JSTL might not be supporting 

