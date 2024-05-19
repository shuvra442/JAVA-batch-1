package method;

public class MethodEx {

    public static void main(String[] args) {

        int a=10, b=30;
//        int c = a + b;
//        System.out.println(c);
        System.out.println(doingSumThings(a,b));

        System.out.println("shuvra patra");

        int e=10, f= 40;
//        int d = e + f;
//        System.out.println(d);
        System.out.println(doingSumThings(e,f));
    }

    public static String doingSumThings(int a, int b){

        String c = String.valueOf(a + b);
        System.out.println("sum of two number :: " +c );

        return c;
    }
}