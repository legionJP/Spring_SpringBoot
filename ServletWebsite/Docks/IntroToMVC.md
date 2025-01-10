
### Backend for the Java 
```
Java class and Model objects , Servlets ..

```

### Front End for the Java

```
- To do frontend part in Java and avoiding the HTML inside Java 
- Use the View Technologies like 
1.  JSP(Jakarta Server Pages)
2. Groovy Markup
3. Script Views 
4. JSP and JSTl 
5. Thymeleaf
6. Free Maker 
```
## Servlet - JSP 
```
- Servlet : Responsible to accept the req from client
- JSP - Use the servlet data and send the HTML/text data to client back 
- as Java Object Oriented : data is saved in object so we have to use the
MVC (Model View Controller ) 
```

# Example MVC 
```
// to add number
 1.----> resquest to--->Controller ----> (2). Object(Modle) [so model have the data after procesing from the controller ] 
 (3.)--->  Controller Sends a data or Model Object to the Views ,
 and view fetch the data and sends back to the client in the text/html content type (CMV or  MVC ) 
```
# MVC 
```
so 
# To create the 1. Controller ---> Have to use the Servlet 
# To create the 2. View ---> use the JSP 
# To create the 3. Model ----> Use the Simple Java Class or (POJO) --> Plain od Java Object class
```
# Note : 
```
The Tomcat is server and also the  servlet container and only the  servlet runs inside the tomcat 
so  to run the JSP it converts the JSP into the servlet  
```


