package OOPsInJAVA.polymorphism.medium;

class A{
    void show(){
        System.out.println("Yes, i'm show method in class A");
    }
}
class B extends A{

    void show(){
//        super.show();
        System.out.println("Yes, i'm show method in class B");
    }
}
public class MethodOverriding {

    public static void main(String[] args) {
        B b = new B();
        b.show();

    }
}
