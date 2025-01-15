#
# Sprign Data Rest Project 


```markdown

Multilayer: 
Controller -- Service --- Repository 
@Controller Class , @Service , @Repository 


Spring Data has the REST and Spring data also hast the JPA 

#### we can remove the Controller layer by using the Spring data Rest 

```

# Hateoas 

```markdown

- If you are responding with the data aslo mention where it can find all the data .
- the links are given for the full api endpoint just have to use the method to delete , or update 

```

```json


    ]
    },
    "_links": {
        "self": {
            "href": "http://localhost:8080/jobPosts?page=0&size=20"
        },
        "profile": {
            "href": "http://localhost:8080/profile/jobPosts"
        }
    },
    "page": {
        "size": 20,
        "totalElements": 5,
        "totalPages": 1,
        "number": 0
    }
}

```