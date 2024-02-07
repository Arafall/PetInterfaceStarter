package edu.otc;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Ralph");
        animal.speak("bark");

        Dog dog = new Dog("Fido");
        dog.speak("wooof");
        dog.feed("bone");

        RobotDog robotDog = new RobotDog();
        robotDog.learn();
        robotDog.feed("gasoline");

        System.out.println(robotDog.intellience);
        robotDog.learn();
        System.out.println(robotDog.intellience);



    }
}