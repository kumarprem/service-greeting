# service-greeting

A. This example is of Spring boot aplication -

##Steps-
###Add depnedency -
1. Add the dependency for required jars in build.gradle or pom.xml file -
  'hystrix-javanica', version: '1.4.0-RC1, spring-cloud-netflix-core, spring-cloud-starter-hystrix'version: '1.1.0.RELEASE, 
  version: '1.1.0.RELEASE.
  
###Implementation -
2. In Application.java use @EnableCircuitBreaker for circuit breaker

3. In service class you need to add   @HystrixCommand(fallbackMethod = "greetWorld") - here greetWorld is method name 
   and the method should be present in the same class where we specify fallback.
4  Also specify @Service annotation in service class.

###Note
5. In your main service method - suppose intracts with service1 which is live and also there is another fallback method 
  where you specify the service2, so when service1 is down then service2 will act like fallback and circuit will trip which is taken care by hystrix.
