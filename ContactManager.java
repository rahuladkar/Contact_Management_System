package Contact_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        ArrayList<Contacts> contacts = new ArrayList<>();

        System.out.println("\n==================== Contact Manager ===================");

        while (true){

            System.out.println("\n1. Add Contact \t\t 2. Remove Contact");
            System.out.println("3. Modify Contact \t 4. Search Contact");
            System.out.println("5. Display Contact \t 0. Exit");
            System.out.print("\nSelect one option : ");
            int choice = ip.nextInt();
            System.out.println();

            switch (choice){

                case 1 : {
                    ContactUtility.addContact(contacts);
                }break;

                case 2 : {
                    ContactUtility.removeContact(contacts);
                }break;

                case 3 : {
                    ContactUtility.modifyContact(contacts);
                }break;

                case 4 : {
                    ContactUtility.searchContact(contacts);
                }break;

                case 5 : {
                    ContactUtility.displayContact(contacts);
                }break;

                case 0 : {
                    System.out.println("Thank You...!");
                    ip.close();
                    System.exit(1);
                }break;

                default:{
                    System.out.println("Wrong Input...!");
                }
            } // end of switch
        } // end of while loop
    } // end of class block
}
