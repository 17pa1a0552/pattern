package PrototypePattern;

public class BlueColour extends Colour{
	public BlueColour()  
    { 
        this.colourName = "blue"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Blue color added"); 
    }
}