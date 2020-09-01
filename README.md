# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.ranu.config.ranu-microservice-config' is invalid and this project uses 'com.ranu.config.ranumicroserviceconfig' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/maven-plugin/reference/html/#build-image)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.3.3.RELEASE/reference/htmlsingle/#production-ready)

### Guides
The following guides illustrate how to use some features concretely:

Microservice -> spring cloud config server 
Scope -> spring cloud config server when working with local or native file path


use get request
http://localhost:8191/service2/default

Response -> 

{
"name": "service2",
"profiles": [
  "default"
],
"label": null,
"version": null,
"state": null,
"propertySources": [
  {
"name": "classpath:/config/service2.yml",
"source": {
"service.greeting": "hi is from service 2"
}
}
],
}


http://localhost:8191/service1/default

Response -> 
{
"name": "service1",
"profiles": [
  "default"
],
"label": null,
"version": null,
"state": null,
"propertySources": [
  {
"name": "classpath:/config/service1.yml",
"source": {
"service.greeting": "hi is from service 1"
}
}
],
}

