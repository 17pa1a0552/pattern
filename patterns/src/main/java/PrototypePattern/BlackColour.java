package PrototypePattern;

public class BlackColour extends Colour{
    public BlackColour() 
    { 
        this.colourName = "black"; 
    } 
   
    @Override
    void addColour()  
    { 
        System.out.println("Black color added"); 
    } 
}