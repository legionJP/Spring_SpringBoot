# REST APIS :


# Backend Architecture
```markdown
Client ---> browser server -> http
Server -->  data in json 
Frontend with seprate UI and
backend will work with JSON or xml data 
Server in the REST will return the data 

```
# REST Architecture
```markdown
- CRUD operations
- Data is Resources 
- and it will have different Entity -  Employee, Employer , as a resource 

- there will the state every time you fetch the data and , server send the data as current state

- SO there is also Representational state transfer so it is called the REST 
- Every request is stateless ( communication method where server completes the any request without  depending on any previous request )

# Noun : in REST we need to use the Noun not the action verbs 
localhost:8080/jobs GET
localhost:8080/jobs post

```
# HTTP methods
```markdown
# GET --- Read data 
# POST --- Create Data (sending to the server)
# PUT --- update the data (updating the data fully)
# DELETE -- delete the data
```