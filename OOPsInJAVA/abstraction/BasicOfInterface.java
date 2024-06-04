package OOPsInJAVA.abstraction;

interface Inter{
    void eat();

}

interface Inter1{
    void add();
}

class Women implements Inter, Inter1{

    public void eat(){
        System.out.println("Eating");
    }

    public void add() {
        System.out.println(4+6);
    }
}

class Men implements Inter{
   public void eat(){
        System.out.println("Eating");
    }
}
public class BasicOfInterface  {

    public static void main(String[] args) {
       Women women = new Women();
       women.eat();

       Men men = new Men();
       men.eat();
    }
}





