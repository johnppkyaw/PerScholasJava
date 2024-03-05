# Steps

### Setup Springboot app with required dependencies
### User.java model ManyToMany relationship with Role
### Role.java model

### UserRepository interface extends JpaRepository<User, Long>
### RoleRepository interface extends JpaRepository<Role, Long>

### Spring Security Config - SecurityConfiguration class
#### has userDetailsService field which is UserServiceImpl obj
#### authenticationProvider() returns DaoAuthenticationProvider obj
#### passwordEncoder() returns BCryptPasswordEncoder obj
#### filterChain(HttpSecurity http) returns SecurityFilterChain obj

### UserPrincipal class that implements UserDetails interface
#### more flexibility and control over user authorization and authentication processes

### UserController
### UserDTO 
#### Validate user registration form by using Hibernate-Validation annotations 

### FieldMatch interface
#### Uses @FieldMatch annotation to support validation process of comparing fields with each other, has first, second, and optional message
#### Has @Constraint(validatedBy = FieldMatchValidator.class) annotation

### FieldMatchValidator implements ConstraintValidator<FieldMatch, Object>
#### initialize(final FieldMatch constraintAnnotation)
#### isValid(final Object value, final ConstraintValidatorContext context)

### UserService interface extends UserDetailsService
### UserServiceImpl implements UserService

### RoleService interface
### RoleServiceImpl

### Thymeleaf templates
#### sign-up page
#### log-in page
#### sign up confirm
#### user home page
