package threads.basic;


class A extends Thread{
    public void run (){
        for(int i = 1; i <=15; i++) {
            System.out.println("@@@ ---> "+i);
        }
    }
}

class B implements Runnable{

    public void run() {

        for(int i = 1; i <=15; i++) {
            System.out.println("$$$$ ---> "+i);
        }
    }
}


public class ThreadEx {

    public static void main(String[] args) {

//      job 1
        System.out.println("<-----Application started ----->");

//       job 2
        A a = new A();
        System.out.println("Hello world");
        a.start();

        for(int i = 1; i <=15; i++) {
            System.out.println("^^^ ---> "+i);
        }

        B b = new B();
        Thread t = new Thread(b);
        t.start();

//        1

//        Runnable b = new B();
//        Thread t = new Thread(b);
//        t.start();

//        2
//        new Thread(new B()).start();

//       job 3
        System.out.println("<-----Application ended ----->");

    }
}
