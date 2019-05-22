package com.javarticles.yaml;

public class Car {
String make;
String type;

public Car(String manufacturer,String model){
    make=manufacturer;
    type=model;
}

@Override
public String toString(){
    return "MAKE = "+make+"\nTYPE = "+type;
}
}