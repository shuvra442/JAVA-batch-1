package String;

import java.util.Scanner;

class stringInput {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        String name= obj.nextLine();
        System.out.println(name);
        obj.close();
}
}
