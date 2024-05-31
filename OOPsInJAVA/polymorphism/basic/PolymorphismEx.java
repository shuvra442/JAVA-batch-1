package OOPsInJAVA.polymorphism.basic;

class Biswajit{

//    in a clg
    void student(){
        System.out.println("I'm a student");
    }

    void son(){
        System.out.println("I'm in my home");
    }

    void customer(){
        System.out.println("i'm in a mall");
    }
}

public class PolymorphismEx {

    public static void main(String[] args) {
        Biswajit biswajit = new Biswajit();
        biswajit.student();
        biswajit.son();
        biswajit.customer();
    }

}
