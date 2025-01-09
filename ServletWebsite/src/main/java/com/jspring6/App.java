package com.jspring6;

// import javax.naming.Context;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        
        // tomcat.start();
        // tomcat.getServer().await();;

        // try {
        //     tomcat.start();
        // } catch (LifecycleException e) {
        //     e.printStackTrace();
        // }

        Context context = tomcat.addContext("", null);
        
        Tomcat.addServlet(context, "ServletWebs", new ServletWebs()); // adding servlet for the
        context.addServletMappingDecoded("/hello", "ServletWebs");

        tomcat.start();
        tomcat.getServer().await();


    }
}
