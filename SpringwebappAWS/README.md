# Cloud Deployment

#  cloud Deployment Intro
```markdown

- It will solve the problem of upfront cost for provisoning the new physical server 
- for the on premises server there is need for server and hardware management 
- cloud services provided the multiple machine server on different locations 
- The IaaS provide the hardware , networking and Storage 
- CaaS: OS which supports the container is called Container as a Service , provides except runtime
- PaaS : Provides everything , hardware , os, contaier, runtime just need to built and deploy application

- Server less Computing : there is servers , but client don't need to worry about servers 
- FaaS : Function as a Service : run the function , don't need to manage where it runs and can scale for multi functions 

- SaaS: Software as a Service : used by normal users , Like google photos , like gmails , docks 

- A developer mostly interact most on the PasS, CaaS
- Many  cloud service works as   Public clouds 
- Also company offers the Hybrid Cloud service 
```
# AWS Different Types of Service 
-   ### IaaS : 
    - ### EC2 (virtual Server and Have to do the setup)
-   ### PaaS"
    - ###  Elastic Beanstalk 
-   ### CaaS
    - ### Elastic Container Service 

# Managing IAM Account : 
    - Create the User Group 
    - 

# Packaging the Jar file
```xml     

<build>
		<finalName>webappaws</finalName>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
```