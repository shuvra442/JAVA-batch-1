package OOPsInJAVA.abstraction.abstractC;

abstract class Animal {  // abstract class

    Animal(){ // it supports constructor
        System.out.println("Animal constructor");
    }

    abstract void sound(); // abstract method  // no need to define body because abstract method dont support body

    void move(){
        System.out.println("Animal can move");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog is Braking");
    }


    void move() {
        super.move();
    }
}

class Lion extends Animal{

    void sound() {
        System.out.println("Roar");
    }

    void move() {
        super.move();
    }
}

public class AbstractEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.move();

        Lion lion = new Lion();
        lion.sound();
        dog.move();

    }
}













