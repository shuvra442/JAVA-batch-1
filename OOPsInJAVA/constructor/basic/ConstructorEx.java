package OOPsInJAVA.constructor.basic;


public class ConstructorEx {

    int a; // a=10 //using this keyword
    int b; // b=20 //using this keyword

    ConstructorEx() {   /*  constructor */  /* default constructor */
        System.out.println("Hello i'm constructor");
    }

    ConstructorEx(int c, int d){ /* parameterized constructor */
        System.out.println("Hello i'm parameterized constructor");
        this.a=c;
        this.b=d;
    }

    ConstructorEx(int a, int b, char c){  /* parameterized constructor */
        System.out.println("Hello i'm parameterized constructor");
    }

    ConstructorEx(int a, int b, char c, char d){  /* parameterized constructor */
        System.out.println("Hello i'm parameterized constructor");
    }

    public static void main(String[] args) {

        ConstructorEx constructorEx1 = new ConstructorEx(); // 1.

        ConstructorEx constructorEx2 = new ConstructorEx(10,20); //  2.
        System.out.println(constructorEx2.a); // 10
        System.out.println(constructorEx2.b); // 20

        ConstructorEx constructorEx3 = new ConstructorEx(10,20,'3'); // 3.

        ConstructorEx constructorEx4 = new ConstructorEx(10,20,'3','c'); // 4.

    }
}
