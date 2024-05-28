package OOPsInJAVA.constructor.medium;

/**
 * constructor chaining  --> when one constructor call another constructor is called constructor chaining
 */

class Constructor{

    Constructor(int a){

        System.out.println("i'm super class parameterized constructor 1-->"+a);
    }
}


public class ConstructorChaining  extends Constructor  {

//    ConstructorChaining(){
//        System.out.println("i'm default constructor");
//    }

    ConstructorChaining(int a){
        super(a);
//        this();
        System.out.println("i'm base class parameterized constructor 1-->" +a);
    }
//    ConstructorChaining(int a, int b){
//        this(a);
//        System.out.println("i'm parameterized constructor 2--> " +a+ " "+b);
//    }

    public static void main(String[] args) {
//        ConstructorChaining obj = new ConstructorChaining(10,20);
        ConstructorChaining obj = new ConstructorChaining(10);
    }
}







