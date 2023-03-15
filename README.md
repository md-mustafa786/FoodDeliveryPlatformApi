# FoodDeliveryPlatformApi

 In this project,A food delivery platform API that allows normal users to order food from restaurants, while the admin can perform CRUD operations on food items and view the orders placed. 
 The API must use a MySQL database and a static IP address for the deployment link. Normal users must be authenticated and able to order one food item at a time while viewing their order history. 
 The API must also use annotation-based validation and include separate controller, service, and repository components.

Overall, this project demonstrates the use of Spring Boot, Maven, and JPA to build a simple food delivery api application.
##  Framework and Language use in this Project-
 *  Springboot
 *  Java
##  Dependencies
 *  Spring Web
 *  MySQL Database
 *  Spring Boot DevTools
 *  Lombok 
 *  Spring Data JPA
 *  Validation
 
### Requirments
 * IntelliJIDEA
 * Serverport: 8080 (use: localhost:8080)
 * IP Address: 52.87.230.236
 * Java version: 17
 * Everything is present in the pom.xml (no need to download any library)
### Steps to run Application
 * Download the source code and import in intellijIDEA.
 * Go to Swagger link:  http://52.87.230.236:8080/swagger-ui/index.html#/
 * Type endpoints 
 ## There are three Models-
 * User
 * Orders
 * Food Items
## User will perform following operations - 
    ##### 1) - Add User Info -
            * In this functionality we are saved user details - 

    ##### 2) - Get an User Info by Id  or All User Details-
            * In this functionality We get one user info. by sending the user-id 

 ## Orders Model will perform following operations - 
    ##### 1) - Add Orders Info-
            * This functionality saved  Orders details - 
 
    ##### 2) - Get all Orders detils of User -
            * This functionality get all Order details of User by providing user Id.
      
      
 ## FoodItems Model will perform following operations -  
  
   ##### 1) - Add FoodItems Info-
            * This functionality saved  FoodItems details -

   ##### 2) - Get FoodItems Info-
            * This functionality get  FoodItems details -
  
   ##### 3) - Update FoodItems detils -
           * This functionality we can update our FoodItems details by foodItemsId-
 
  ##### 4) - Delete FoodItems Info-
          * This functionality Delete  FoodItems details -

### Note
* You can change server port by application.properties file i.e.

        server.port=8081
