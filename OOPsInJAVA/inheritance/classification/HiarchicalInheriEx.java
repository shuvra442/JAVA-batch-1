package OOPsInJAVA.inheritance.classification;

class A{
    void Print(){
        System.out.println(" :: Always i'm  single :: ");
    }
}

class B extends A  {
    void Print1(){
        System.out.println(" :: Always i'm  not single :: ");
    }
}

class C extends A {
    void Print2(){
        System.out.println(" :: Always i'm single :: ");
    }
}

public class HiarchicalInheriEx {

    public static void main(String[] args) {
        C c = new C();
        c.Print();
        c.Print2();

        B b = new B();
        b.Print1();
        b.Print();
    }
}


