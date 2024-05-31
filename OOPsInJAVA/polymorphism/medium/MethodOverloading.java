package OOPsInJAVA.polymorphism.medium;

public class MethodOverloading {

    void print(){
        System.out.println("Hi i'm 1st");
    }

    void print(int a, int b){
        System.out.println("Hi i'm 1st" + (a+b));
    }

    void print(double a, int b){
        System.out.println("Hi i'm 1st"+ (a+b));
    }

    public static void main(String[] args) {
        MethodOverloading a = new MethodOverloading();
        a.print();
        a.print(2,3);
        a.print(2.5, 6);
    }
}
