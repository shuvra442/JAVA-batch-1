package OOPsInJAVA.inheritance.classification;

public class SingleInheiEx extends Single  {

    public static void main(String[] args) {
        SingleInheiEx singleInheiEx = new SingleInheiEx();
        singleInheiEx.Print();
    }
}

class Single{
    void Print(){
        System.out.println(" :: Always i'm  single :: ");
    }
}