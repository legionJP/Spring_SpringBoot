package com.jspring6;

public class ScopeAnnottion {
    public void ScopeAnnottionExample()
    {
        System.out.println("Scope Annotation Example in Java Based Config ");
    }
}

/*
 * 
 * 
 * 
// prototype bean
// AppConfig File
    @Bean
    @Scope("prototype")
    //@Bean(name = "comp1")
    // @Bean(name={"comp1", "cpmp2","jp"})
    public ConfigDesktop desktop() //  Using  the ConfigDesktop 

    // App.java File
    {

        ConfigDesktop dt2 = context.getBean(ConfigDesktop.class);
        dt2.compile();


        ConfigDesktop dt = context.getBean(ConfigDesktop.class);
        dt.compile();  // here bothe bean are working with the same obj 

        // to get the different bean obj  we have to use the @Scope anotation and  prototype 
 * 
 */