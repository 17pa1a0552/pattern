package com.epam.designpatterns;

import AdapterPattern.*;
import BridgePattern.*;
import CommandPattern.*;
import PrototypePattern.*;
import TemplatePattern.*;
import SingletonPattern.*;

public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
        DriverAdapter adapter = new DriverAdapter();
        DriverBridge bridge = new DriverBridge();
        DriverCommand command = new DriverCommand();
        DriverPrototype prototype = new DriverPrototype();
        DriverSingleton singleton = new DriverSingleton();
        DriverTemplate template = new DriverTemplate();
    }
}