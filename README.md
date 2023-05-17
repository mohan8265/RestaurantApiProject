# RestaurantApiProject
## Framework and Language used
* Spring Boot
* Java
---

## Data flow
1. Controllers
    * AdminController
    * FoodController
    * OrderController
    * UserController
---
2. DTO
    * SignInInput
---

3. Models
    * Admin
    * AuthenticationToken 
    * Food
    * Order
    * Status (enum)
    * User
---

4. Services
    * AdminService
    * AuthenticationTokenService
    * FoodService
    * OrderService
    * UserService
---

5. Repositories
    * IAdminRepo
    * IAuthenticationTokenRepo
    * IFoodRepo
    * IOrderRepo
    * IUserRepo
---

## Data Structure Used
* List
---

## Project Summary
```There are three entities in this Project Admin, Normal User, and Visitor. Admin have the access of adding foods to Restaurant Api and they also can get list of foods and users. users firt need to signup then signin to their account for ordering foods. there are some validation for these. visitor can have acces only get the list of foods. any of three entity have access to get the list of food or any particular food.```



