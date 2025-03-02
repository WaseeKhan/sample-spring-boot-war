# Steps to create war file to deploy on external server
## Below are the steps to make changes in your existsing springboot Application
### 1. change packaging in `pom.xml`
      `<packaging>war</packaging> --change or add here
	    <groupId>com.sampleapp</groupId>
	    <artifactId>sampleapp</artifactId>
	    <version>0.0.1-SNAPSHOT</version>
	    <name>sampleapp</name>
	    <description>sampleapp project for Spring Boot</description>
     `

 ### 2. Add `spring-boot-starter-tomcat` with scope `provided`
      `
      	<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-tomcat</artifactId>
    		<scope>provided</scope>
	</dependency>
    `

### 3. Extends `SpringBootServletInitializer` class in main class & override `configure` method as per below code.

      `
      @SpringBootApplication
      public class SampleappApplication extends SpringBootServletInitializer{

      	public static void main(String[] args) {
      		SpringApplication.run(SampleappApplication.class, args);
      	}
      	@Override
      	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      		
      		return builder.sources(SampleappApplication.class);
      	}
      
      `
## Code level changes are done, now we're ready to go with `mvn` build
### Run below command from prorjects home folder.

`mvn clean package
`
## Finally!! war file will be created in `target` folder

