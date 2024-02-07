package edu.otc;

public class RobotDog extends Robot implements Pet {
    public String name;


    @Override
    public void feed(String fuel) {
        System.out.printf("Refueled with %s\n", fuel);
    }
}
