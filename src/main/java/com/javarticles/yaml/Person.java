package com.javarticles.yaml;

public class Person {
boolean male; //true for male, false for female
int years;
String name;
String surname;

public Person(String gender, String age, String fullName){
    if(gender.equals("male"))
        male = true;
    else
        male = false;
    years=Integer.parseInt(age);
    String splitted[] = fullName.split(" ");
    name = splitted[0];
    surname = splitted[1];
}

@Override
public String toString(){
    String gender = "male";
    if(!male)
        gender = "female";
    return "SEX = "+gender+"\nYEARS = "+years+"\nNAME = "+name+" "+surname;
}
}

