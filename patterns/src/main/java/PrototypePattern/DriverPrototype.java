package PrototypePattern;

public class DriverPrototype {
	public DriverPrototype() {
		System.out.println();
		System.out.println("-----Prototype_Pattern-----");
		ColourStore.getColor("blue").addColour(); 
	    ColourStore.getColor("black").addColour(); 
	    ColourStore.getColor("black").addColour(); 
	    ColourStore.getColor("blue").addColour(); 
	}
}