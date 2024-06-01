package OOPsInJAVA.encapsulation.basic;


class Dog{
    private String name; //instance variable

    public void setName(String n){
        System.out.println(n);
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class EncapsulationEx {

    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog.name);
        System.out.println(dog.getName());
        dog.setName("Rocky");
        System.out.println(dog.getName());
    }
}
