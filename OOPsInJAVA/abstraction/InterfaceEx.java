package OOPsInJAVA.abstraction;

interface Shape{

   int a = 20; // public + static + final

    void draw();

    void add();
}
class Circle implements Shape {


    @Override
    public void draw() {
        System.out.println("Round");
    }

    @Override
    public void add() {

    }
}

class Square  implements Shape {
    @Override
    public void draw() {
        System.out.println("Square ---> Square ");
    }

    @Override
    public void add() {

    }
}

public class InterfaceEx {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
        circle.add();
        Shape square = new Square();
        square.draw();
        square.add();
    }

}
