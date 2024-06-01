package OOPsInJAVA.encapsulation.medium;

class Name{
    private  String firstName;
    private  String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

public class EncapsulationExx {
    public static void main(String[] args) {
        Name name = new Name();
        name.setFirstName("Biswajit");
        name.setLastName("Singh");
        System.out.println(name.getFirstName()+ " "+name.getLastName());

        name.setFirstName("Mahadev");
        name.setLastName("Maity");
        System.out.println(name.getFirstName());
        System.out.println(name.getLastName());
    }
}
