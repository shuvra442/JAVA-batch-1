package keys;

public class Static {

    static {
        System.out.println("Hello java");
    }

    static int sumOfTwo(int a, int b){
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) {

        int v=sumOfTwo(2,4);
        System.out.println(v);

    }


}
