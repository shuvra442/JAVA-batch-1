package OOPsInJAVA.constructor;

class A{
    void go()
    {
        System.out.println("The quick brown fox");
    }
}
class B extends A{
    void went()
    {
        System.out.println("jumps over the");
    }
}
class C extends B{
    void gone()
    {
        System.out.println("lazy dog");
    }
}
public class X {
    public static void main(String[] args) {
        C put = new C();
        put.go();
        put.went();
        put.gone();
    }
}
