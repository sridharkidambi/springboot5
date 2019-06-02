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

## BEAN lifecycle

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
