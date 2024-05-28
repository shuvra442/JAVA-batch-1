package OOPsInJAVA.inheritance.classification;

public class basic extends advanced {

    void biswajit(){
        System.out.println("I'm basic class that's why no one call me ");
    }

    public static void main(String[] args) {
        basic obj = new basic();
        obj.biswajit();
        obj.mahadev();
    }
}

class advanced{
    void mahadev(){
        System.out.println("I'm advanced class that's why all of those class call me ");
    }
}

/**
 * here I want to call advanced class without creating object of advanced class
 *  it's possible ??? \
 *  yes, with the help of inheritance concept
 *
 *classification --> 1. single inheritance 2. multi-level inheritance 3. hybrid inheritance
 *
 */