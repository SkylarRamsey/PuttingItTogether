package com.puttingItTogether.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Create a Dog!" );
        
        Dog AppDog = new Dog("App", "App-Dog");
        
        AppDog.setWeight(50);
        
        System.out.println( "Your dog's name is: " + AppDog.getName() );
        
        System.out.println( "Your dog weighs " + AppDog.getWeight() + "lbs" );
        System.out.println( "Let's feed it!" );
        AppDog.eat();
        System.out.println( "Your dog now weighs " + AppDog.getWeight() + "lbs" );
    }
}
