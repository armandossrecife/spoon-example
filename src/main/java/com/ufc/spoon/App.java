package com.ufc.spoon;

import spoon.Launcher;
import spoon.SpoonAPI;

public class App 
{
    public static void main( String[] args )
    {    	
    	SpoonAPI api = new Launcher();
    	api.addInputResource("/Users/armandosoaressousa/git/sem/bank-sys");
    	api.buildModel();
    	api.addProcessor("com.ufc.spoon.LoCProcessor");		
    	api.process();
    }
    
}
