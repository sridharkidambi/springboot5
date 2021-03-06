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
     
<img width="714" alt="Screenshot 2019-06-22 at 9 47 30 AM" src="https://user-images.githubusercontent.com/8262606/59959342-e060e400-94d2-11e9-9218-1376e2b3287b.png">
     
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
###### @EqualsAndHashCode(exclude={"Receipes"})


####### ArgumentCaptor: 
    Use it to capture argument values for further assertions.
    ArgumentCaptor<Person> argument = ArgumentCaptor.forClass(Person.class);
      verify(mock).doSomething(argument.capture());
      assertEquals("John", argument.getValue().getName());
      
      
      @mock
       mocks a  class based on its instance type no side effects.have validation possible.
       
       @spy 
       makes the spy class a wrapper arounf the original class.
       
       @Fake 
       a smalled implementation of a actual one.
       
       @Stub
       making specific actions possible for a class.
       
       @Rule
       to execute some precondition and post condition.
       
       
    Springcontext for test is reloaded once and every test runs with the preloaded context.
    

######  Docker:
    
Use link to connect the docker images for running containers.

docker logs -f imageid (-f follow)

docker image inspect mongo -shows the layers of images with their SHA hashcodes.

docker images -q  --no-trunc

###### Docker Clean commands:

<img width="1234" alt="Screenshot 2019-06-20 at 11 45 06 AM" src="https://user-images.githubusercontent.com/8262606/59825461-b502bb80-9351-11e9-865a-ed57261224dc.png">
<img width="1232" alt="Screenshot 2019-06-20 at 11 45 21 AM" src="https://user-images.githubusercontent.com/8262606/59825462-b502bb80-9351-11e9-9c61-b45206c54e22.png">
<img width="1267" alt="Screenshot 2019-06-20 at 11 47 17 AM" src="https://user-images.githubusercontent.com/8262606/59825464-b502bb80-9351-11e9-8a44-2d33a8be6247.png">


####### 
<img width="714" alt="Screenshot 2019-06-22 at 9 47 30 AM" src="https://user-images.githubusercontent.com/8262606/59959424-7ea17980-94d4-11e9-9d1a-b1a9d65a0734.png">
<img width="426" alt="Screenshot 2019-06-22 at 9 57 12 AM" src="https://user-images.githubusercontent.com/8262606/59959425-7ea17980-94d4-11e9-9c64-33438e2bdab3.png">

####docker cheatsheet:
https://springframework.guru/docker-cheat-sheet-for-spring-devlopers/


###### Micro Service:
############ Server Side Load Balancing 

eureka server or consul

############ client Side Load Balancing 
Ribbon 

######### Reactive Architecture 
<img width="1503" alt="Screenshot 2019-06-22 at 2 23 12 PM" src="https://user-images.githubusercontent.com/8262606/59962577-f7b8c500-9504-11e9-9902-91d224ebc063.png">
<img width="1659" alt="Screenshot 2019-06-22 at 2 24 31 PM" src="https://user-images.githubusercontent.com/8262606/59962578-f7b8c500-9504-11e9-9d2a-321f2e5ee4aa.png">
<img width="1179" alt="Screenshot 2019-06-22 at 3 22 37 PM" src="https://user-images.githubusercontent.com/8262606/59962579-f8515b80-9504-11e9-808a-690405ac56b2.png">

##### JAVA 8:

https://www.tutorialspoint.com/java8/java8_optional_class.htm