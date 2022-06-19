package MobilePhoneProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Eoin's phone");

        phone.addContact("Dennis", "0860868573");
        phone.addContact("Caolan", "0861277436");
        phone.addContact("Mammy\t", "0877457083");

        printMenu();

        int choice;
        boolean check = true;
        do{
            check = true;
            choice = getInt("Enter choice:");
            switch(choice) {
                case 1:
                    phone.printContacts();
                    break;
                case 2:
                    phone.addContact(getString("Enter name:"), getString("Enter number"));
                    break;
                case 3:
                    phone.findContact(getString("Enter name you wish to find"));
                    break;
                case 4:
                    phone.updateContact(getString("Enter name of contact you wish to update:"), getString("Enter new number: "));
                    break;
                case 5:
                    phone.removeContact(getString("Enter name of contact you wish to delete"));
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    check = false;
                    break;
            }


        } while(check == true);
    }

    private static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Show contacts");
        System.out.println("2. Add contact");
        System.out.println("3. Find contact");
        System.out.println("4. Update contact");
        System.out.println("5. Delete contact");
        System.out.println("6. Show menu");
        System.out.println("7. Quit");
    }

    private static int getInt(String prompt) {
        Scanner keyIn = new Scanner(System.in);
        System.out.println(prompt);
        return keyIn.nextInt();
    }

    private static String getString(String prompt) {
        Scanner keyIn = new Scanner(System.in);
        System.out.println(prompt);
        return keyIn.nextLine();
    }
}

