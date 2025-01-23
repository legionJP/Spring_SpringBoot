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
    - add the user in the user group

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

# Deploying on the AWS BeanStalk

- Create the  role for EC2_Javaapp 
- add the Policies for beanstalk , awabeanstalksns , Admininstrator access , beanstalkwebtier, worker tier , waselasticBeanstalk

- Create the application in the AWSElasticBeanStalk , select java for jar and upload the jar file 

# Spring Proj With DB+

### Using AWS RDS : 
- #### Create RDS Database	with the DB identifier as name select engine 
- Connect the DB server in the local machine using the postgres pgadmin or cli , for connection use endpoint of rds aws 
- modify the security group for the inbound rule to accept the tcp traffic on port 5432 


# Introduction to ECS :

	- ECS (Elastic Container Services)
	- Nedd to run two container for the Postgres and App 
	- these container will be running inside the cluster 
	- two images for postgres on  docker hub and image of the app

	- As Postgres on the docker hub already , But the app image we have to put it on the ECR: Elastic Container Registory
	- So need to put the images on the ECR and then pull them into the ECS and then run it there 
	- Also Need the AWS CLI --> to push the image from local machine to ecr we need the aws-cli 

	- So First have the CLI , and push image to ECR then get the ECS 

# Configuring the AWS CLI

	- Install the AWS-CLI from aws web.
	- create the aws configure , to see "aws iam list-users" or redirect the ouput in file in window : >output.txt
	-
# Creating the Cluster and ECR 
	- go to ECS create the cluster and give the cluster name 
	- choose the infrastructure : 1. AWS - fargate(serverless) 2. or EC2 3. or external instance 
	- then  run  the task for the cluster 
	- 

# 1 Creating the task defination 

-	### Container - 1 Info

- Specify a name, container image, and whether the container should be marked as essential. Each task definition must have at least one essential container.
```markdown
Name                 Image URI				Essential container
postgres-container   postgres:latest			Yes
```
- ### Port mappings
- 1. for http port on 80
- 2. for postgres port : 5432

### Environment variables - optional

```markdown
- the container of db  need 3 thins as environment variable 
- DB
- Username
- Password 
```
# Example
| Key               | Value Type | Value    |
|-------------------|------------|----------|
| POSTGRES_DB       | Value      | jspring6 |
| POSTGRES_USER     | Value      | postgres |
| POSTGRES_PASSWORD | Value      | password |

# 3. Running the Task for Postgres container in cluster 
	- go to run task 
	- select the launch type 
	- select task family 
	- can create the new securty group while selcting the vpc 
	- allow all traffic on the source from 	anywhere or required one 
	- turn on public ip 
	- Noe connect the running taks 52.11.22.33 with the public IP on your local machine postgres server to test 

# Now add the docker file for the jdk , and 