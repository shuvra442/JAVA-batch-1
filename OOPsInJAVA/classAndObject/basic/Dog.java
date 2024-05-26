package OOPsInJAVA.classAndObject.basic;


class Behaviour {
    String name;
    int age;
    String breed;
    String color;

}

public class Dog {
    public static void main(String[] args) {
        Behaviour behaviour = new Behaviour(); //

        behaviour.age=10;
        behaviour.breed="labrador";
        behaviour.color="black";
        behaviour.name="Rinki";

        System.out.println(behaviour.age);
        System.out.println(behaviour.breed);
        System.out.println(behaviour.color);
        System.out.println(behaviour.name);
//
//        Behaviour behaviour1 = new Behaviour();
//        behaviour1.age=12;
//        behaviour1.breed="jarman shpared";
//        behaviour1.color="white";
//        behaviour1.name="Rocky";
//
//        System.out.println(behaviour1.age);
//        System.out.println(behaviour1.breed);
//        System.out.println(behaviour1.color);
//        System.out.println(behaviour1.name);

        AddiotionEx addiotionEx = new AddiotionEx();
        addiotionEx.add(10, 20);

        AddiotionEx addiotionEx1 = new AddiotionEx();
        addiotionEx1.add(20, 30);

        addiotionEx1.sub(20,10);


    }
}




