https://springframework.guru/reactive-streams-in-java/

JPA implementations
hibernate(72%) others openjpa and eclipselink

Spring data repositories:
A repository which delegates the underlying persistance layer which later can be interchanged.

Spring Data JPA:
uses hibernate to support the underlying datastore.
provides implementation at runtime.(like LINQ)
no SQL required.

GRAILS ---groovy wrapper over spring framework

ApplicationListener<ContextRefreshedEvent> :used to initialize the component
https://www.baeldung.com/spring-context-events

## SOLID Priciples
SOLID principle (OOPS)

SIngle responsibilty principle.
Open closed principle.(open for extension and closed for modification).
Liskov subsition principle.(make the abstractions properly).
Interface seggregation Principle( not general interface have specific interface thereby no god interface.)
Dependency Inversion Principle.( higher level and lower level objects depend on the same abstract interaction).


DI - is how you define your classes composition
Ioc is the runtime environment for your code.
Spring frameworks IOC container.

Dependency injection is not satisfied --you get a null point error.

## BEAN lifecycle :>

<img width="1650" alt="Screenshot 2019-06-02 at 8 34 33 AM" src="https://user-images.githubusercontent.com/8262606/58756288-344f5d00-8513-11e9-8e87-ec21dc6d38b5.png">
<img width="1670" alt="Screenshot 2019-06-02 at 8 34 44 AM" src="https://user-images.githubusercontent.com/8262606/58756289-344f5d00-8513-11e9-804f-176b24017255.png">

### CallBack Interfaces
Spring bean has 2 interfaces which u can implement for callback interfaces

Initializingbean.afterpropertiesSet()
DisposableBean.destroy()

### Annotations(called after bean has been constructed but before being returned to the requesting object)
@PostConstruct
@PreDestroy

### Bean Post Processors(called during the beans are getting processed)
PostProcessorBeforeInitialization
PostProcessorAfterInitialization


### 14 aware interfaces

<img width="1661" alt="Screenshot 2019-06-02 at 9 09 45 AM" src="https://user-images.githubusercontent.com/8262606/58756444-526a8c80-8516-11e9-8467-6a9e23dfdf8e.png">

### Spring Framework Sterotypes:

available are: @component @repository @Service @RestController @Controller

<img width="1499" alt="Screenshot 2019-06-04 at 10 48 20 AM" src="https://user-images.githubusercontent.com/8262606/58853018-6c42d580-86b6-11e9-9163-1b9a7454ed0f.png">


Defentions:

@repository provides more exception handling undelying the architecture

@component scan is used scan components outside the springboot package.

<img width="1555" alt="Screenshot 2019-06-04 at 10 58 52 AM" src="https://user-images.githubusercontent.com/8262606/58853413-d5771880-86b7-11e9-8e16-164958a4484a.png">

Spring Bean creation suing the @configuration attributes


@SpringbootApplication encapuslates the following annotations
@Componentscan @EnableAutoConfiguration @COnfiguration



SPRING BEAN Scope

Singleton
proptype(new everytime)
Request: one per httprequest- valid in contect aware spring aplicationcontext
Session: A single instace per http session - valid in contect aware spring aplicationcontext

Global session
Application lifecycle  of  servletcontext
Webscoket
Cusotm scope

cannot override singleton and prototype scopes


### Properties:

Profile based properties have more precedence than propertiesfile.

### HTTP interceptor & live reload
add the plugin axix tcpmon on a port different from tomcat port and configure the traffic through tcpmon

live reload for browser refresh

## JPA hibernate:

    ### Releationship Types:
        one to one
        one to many
        Many to One
        Many to Many
        
    ### Directional
        uni directional
        Bidirectional(preferred)
        
    ### Fetch Types:
    
        Lazy Fetch type
        Eagar Fetch Type
        
        One to many (lazy default)
        Many to many ( Lazy fetch type)
        Many to one and one to one (eagar type default)
     
    ###  Cascade Types:( changes are effect to the releated components)
         Persist
         Merge
         Refresh
         Remove 
         Detach
         
     ### Embedded Types (categorizing a set of fields for multipurpose needs). for ex shipping and billing address.
     have address as embeddable
    
        ### Inheritance
    https://www.baeldung.com/hibernate-inheritance
        Mapped Superclass
        Single table
        Joined table
        Table per class
        
    @PrePersist and @PreUpdate (audit timestamps via JPA lifecycle callbacks
    @CreationTimestamp and @UpdateTimeStamp
    
    
   ###### JDL studio (enitity mapped tool)
   
   
   ###### Sample JPA program-Design:
   
   <img width="1650" alt="Screenshot 2019-06-10 at 7 13 32 AM" src="https://user-images.githubusercontent.com/8262606/59167572-74d05b80-8b4f-11e9-889a-f45a79cdf500.png">
     
         
         
    
   ###### DDL Manupulation using hibernate
    hibernate provides the following options:none,validate,update,create,create-drop otpions for DDL 
     intialize with Hibernate (using SQL files).
     
     Spring ways of creating :
     1.Spring Datasource initializer will load the schema.sql and data.sql from the root path.
     2. or spring boot will load from schema-${platofrm}.sql and data-${platofrm}.sql files. 
     and set the value for  spring.datasource.platform must be set
     
  ### how to make the bidirectional reletionship simple:
  addining into the the properties to update the reverse direction while updatung the aprent.
  

#####@notempty
used to specify the validation constraint.

### JPA repository :
repository interface bottom of the spring data repository
CrudRepository (extends Repository)
PagingAndSortingRepository
Jparepository extends PagingAndSortingRepository


### Lombok


##### @Data
will make @getter @ setter @tostring @EqualsandHashcode @Requiredargsconstructor automatically

###### @value
makes it private and final

###### @builder
###### @SneakyThrows 
    throw checked exceptions withoutdevlaring
###### @Syncronized 
    A safer implementation of java syncronized.
###### @Getter(lazy=true)



