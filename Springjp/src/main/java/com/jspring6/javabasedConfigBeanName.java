package com.jspring6;

public class javabasedConfigBeanName {
    public static void main(String[] args) {
        System.out.println("This is Bean Name Note: ");
    }
}

/*
 *  // See the Implementation in AppConfig,.java and App.java
 * 1.
        // Bean name: 
        ConfigDesktop dt1 = context.getBean("desktop", ConfigDesktop.class);
        dt1.compile();

        // Here By default the Bean Name is the Name of the Method so we have to use the method name desktop from appconfig.java
        // can give the name as arg to @Bean(name="com1") or multiple name and put the name in .get bean 
 * 
 * 2. 
 *  
        // Bean name: 
        //ConfigDesktop dt1 = context.getBean("desktop", ConfigDesktop.class);
        ConfigDesktop dt1 = context.getBean("comp1", ConfigDesktop.class);
        dt1.compile();

 * 
 * 
 */