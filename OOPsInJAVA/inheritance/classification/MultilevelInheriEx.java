package OOPsInJAVA.inheritance.classification;

class Single1{
    void Print(){
        System.out.println(" :: Always i'm  single :: ");
    }
}

class SingleInheiEx1 extends Single1  {
    void Print1(){
        System.out.println(" :: Always i'm  not single :: ");
    }
}


public class MultilevelInheriEx extends SingleInheiEx1 {

    public static void main(String[] args) {
        MultilevelInheriEx obj = new MultilevelInheriEx();
        obj.Print();
        obj.Print1();


    }
}




