package com.springboot.sf6sb3;

public class LayersClientServer {
    public void differentLayer()
    {
        System.out.println("Different Layers in Java Application ");
    }
}


// Different Layers : 

// - 1. Client - Server - DataBase


// - Server - ---> Contrller(job- Accept the req and send data)
//     ---> Service (Layer to do the process , like sort the avg prodect rating ) - 
//         ----> Repository (DAO, (To interact with the data and do process and get data from DB)) 
//     ----> DataBase[ <--- DataBase--]



// Service -- Only do the Processing 


// 1. To use the different packages for the different things 
// 2 . there is Objects which we pass between the layers and the obj can be called the Model
// so the Desktop , laptop , and DISpring called the model and they should be in the model packages


// Repositry 