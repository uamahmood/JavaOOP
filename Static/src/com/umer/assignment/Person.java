package com.umer.assignment;

public class Person {
    private int age;
    private String name;
    // the variable is now private
    private static int numberOfPeople = 0;
    public Person(int ageParam, String nameParam) {
        age = ageParam;
        name = nameParam;
        numberOfPeople++;
    }
    
    public static int peopleCount() {
        return numberOfPeople;
    }
}
