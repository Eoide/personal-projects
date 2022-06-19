package MobilePhoneProject;

public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void updateNumber(String number) {
        this.number = number;
    }

    public String toString() {
        String str = "Name: " + name + "\tNumber: " + number;
        return str;
    }
}
