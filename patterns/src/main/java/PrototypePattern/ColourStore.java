package PrototypePattern;
import java.util.*;

public class ColourStore {
	private static Map<String, Colour> colorMap = new HashMap<String, Colour>();  
    
    static 
    { 
        colorMap.put("blue", new BlueColour()); 
        colorMap.put("black", new BlackColour()); 
    } 
       
    public static Colour getColor(String colourName) 
    { 
        return (Colour) colorMap.get(colourName).clone(); 
    } 
}