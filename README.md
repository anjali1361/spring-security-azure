# spring-security-azure

## Description
* A web application made with Spring-Boot and Azure which mainly focus on to provide high level security.
* Signle sign-on with MFA - Azure Active Directory(Microsoft Azure AD)
* Role based access - Spring Security(module in Spring-Boot)
* Database - Microsoft Azure MySQL Database
* Frontend - JSP, Bootstrap, HTML, CSS
* Libraries/Dependencies - jstl, lombok, spring-security starter, microsoft azure active directory, spring boot starter JPA, spring sttarter web
* Build enviorenment - Maven

## Flow
* Run the application(user your prefered IDE for spring-boot application)
* Localhost:8080
* Redirect you to the Microsoft login page(here login with your azure AD  username credential created following the tutorial above and enter the correct password)
* If the credentials are eneterd correct, you will be redirected to home page and can operate the CRUD features else It will reirect to error page showing message:- Sorry, you are not authorized to view this

## To run this application
* Fork & Clone the project.
* Setup Azure AD tenant-id, client-id, client secret and user group (following the tutorial here https://www.youtube.com/watch?v=cczyS4D-RDA) and then add your credeentials in the file "spring-security-azure/src/main/resources/application.yml"
* Create Microsoft MySQL database instance(setup cloud server) and then replace connection string, username and password in file "spring-security-azure/src/main/resources/application.properties", (follow the tutorial - https://www.youtube.com/watch?v=O6tlkpFmZds) and host the application as WEB Appp on Azure App service.
* Note:- You can also setup local MySQL server databse for testing purpose and use it's credentials to update application.properties file and run your project at localhost.

## Related Screenshots!

### Redirect URL configured on Azure AD
<img src="https://github.com/anjali1361/spring-security-azure/blob/main/image/login.png" width ="1000px" height ="550px"> 

------------------------------------------

### Home
<img src="https://github.com/anjali1361/spring-security-azure/blob/main/image/home.png" width ="1000px" height ="550px">
  

------------------------------------------

### Add Product
<img src="https://github.com/anjali1361/spring-security-azure/blob/main/image/add.png" width ="1000px" height ="550px">

------------------------------------------

### Update Product
<img src="https://github.com/anjali1361/spring-security-azure/blob/main/image/update.png" width ="1000px" height ="550px">

------------------------------------------

### Error
<img src="https://github.com/anjali1361/spring-security-azure/blob/main/image/error.png" width ="1000px" height ="550px">

------------------------------------------

### Project Explanation 
https://www.youtube.com/watch?v=VAjAOz6ZRl8

