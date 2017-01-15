package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		//to create a servlet container and host our app using the following static method
		SpringApplication.run(CourseApiApp.class, args);
		
//		2017-01-15 12:09:56.506  INFO 8012 --- [           main] i.j.springbootstarter.CourseApiApp       : Starting CourseApiApp on Lenovo-PC-Jake with PID 8012 (C:\Users\Ravi\Desktop\SpringSuite\course-api2\target\classes started by Ravi in C:\Users\Ravi\Desktop\SpringSuite\course-api2)
//		2017-01-15 12:09:56.508  INFO 8012 --- [           main] i.j.springbootstarter.CourseApiApp       : No active profile set, falling back to default profiles: default
//		2017-01-15 12:09:56.550  INFO 8012 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@a94ee4: startup date [Sun Jan 15 12:09:56 PST 2017]; root of context hierarchy
//		2017-01-15 12:09:57.470  INFO 8012 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
//		2017-01-15 12:09:57.479  INFO 8012 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
//		2017-01-15 12:09:57.479  INFO 8012 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.6
		
		//Setup default configuration
		//Starts Spring Application Context : a container for servlets and other services, controllers
		//Perfoms class Path Scan : scans all class paths to determine annotations of classes which have to be treated with spl case
		//Starts Tomcat server
	}

}
