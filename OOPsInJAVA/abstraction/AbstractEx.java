package OOPsInJAVA.abstraction;


abstract class Shapee{
    int add(){
        int a = 20;
        int b=30;
//        System.out.println();
        return (a+b);
    }
}

public  class AbstractEx extends Shapee{

    public static void main(String[] args) {
        AbstractEx abstractEx = new AbstractEx();
        System.out.println(abstractEx.add());

    }
}
