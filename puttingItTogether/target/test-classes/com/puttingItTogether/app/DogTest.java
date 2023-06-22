package com.puttingItTogether.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DogTest {
	
	Dog myDog;

    @BeforeEach
    public void setUp(){
        System.out.println("This is run before");
        myDog = new Dog("Jimmy", "Beagle");
    }
    @AfterEach
    public void tearDown(){
        System.out.println("This is run after");
    }
    @Test
    public void createNewDog(){
    	System.out.println("CREATION TEST: ");
        assertEquals("Jimmy", myDog.getName(), "Error in creating a dog");
    }
    @Test
    public void feedDog(){
    	
    	System.out.println("FEEDING TEST: ");
        myDog.setWeight(5);
        //weight is now 5
        myDog.eat();
        //adds 5 to current weight
//        assertEquals("Error when eating", 10, myDog.getWeight());
        if(myDog.getWeight() != 10)
        {
        	System.out.println("ERROR WEIGHT IS NOT ACCURATE, EXPECTED WEIGHT: 10, DOG WEIGHT: " + myDog.getWeight());
        }
        assertEquals( 10, myDog.getWeight(), "Error in feeding dog");
        
    }

}
