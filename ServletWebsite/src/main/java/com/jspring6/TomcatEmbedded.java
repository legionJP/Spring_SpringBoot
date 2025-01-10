package com.jspring6;

public class TomcatEmbedded {
    public void TomcatEmbeddedConfig()
    {
        System.out.println(" Tomcat embedded config ");
    }
}

// Tomcat configuration in Mai class

// public static void main( String[] args ) throws LifecycleException
// {
//     System.out.println( "Hello World!" );

//     Tomcat tomcat = new Tomcat();
//     tomcat.setPort(8080);

    // get connector
    // tomcat.getConnector();
//     // tomcat.start();  
//     // tomcat.getServer().await();;

//     // try {
//     //     tomcat.start();
//     // } catch (LifecycleException e) {
//     //     e.printStackTrace();
//     // }

//     Context context = tomcat.addContext("", null);
    
//     Tomcat.addServlet(context, "ServletWebs", new ServletWebs()); // adding servlet for the
//     context.addServletMappingDecoded("/hello", "ServletWebs");

//     tomcat.start();
//     tomcat.getServer().await();


// }
// }