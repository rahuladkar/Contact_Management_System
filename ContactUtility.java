package Contact_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactUtility {

    static String name;
    static long mobNo;
    static String email;


    public static void addContact(ArrayList<Contacts> contacts){

        Scanner ip = new Scanner(System.in);

        System.out.println("Contact Details : \n");
        System.out.print("Enter the Name : ");
        name = ip.nextLine();

        System.out.print("Enter the Mobile Number : ");
        mobNo = ip.nextLong();
        ip.nextLine();

        System.out.print("Enter the Email ID : ");
        email = ip.nextLine();

        contacts.add(new Contacts(name,mobNo,email));

    }

    public static void removeContact(ArrayList<Contacts> contacts){

        Scanner input = new Scanner(System.in);

        if (!contacts.isEmpty()){

            System.out.println("Contact Details which you want to remove : \n");
            System.out.print("Enter the Mobile Number :");
            mobNo = input.nextLong();

            boolean flag = false;
            Contacts demo = null;
            for (Contacts elm : contacts){
                if (elm.getMobNo()==mobNo){
                    demo = elm;
                    flag = true;
                }
            }
            contacts.remove(demo);

            if (flag){
                System.out.println("\nSuccessfully remove the record...!\n");
            }
            else {
                System.out.println("Mobile Number not found...!");
                System.out.println("Please enter it again...!");
                removeContact(contacts);
            }
        }
        else {
            System.out.println("The Contact List is empty...!");
            System.out.println("First insert some contacts...!");
        }


    }

    public static void displayContact(ArrayList<Contacts> contacts){

        if (!contacts.isEmpty()){

            System.out.println("All Contact : \n");
            for (Contacts elem : contacts){
                System.out.println(elem);
            }

        }
        else {
            System.out.println("The Contact List is empty...!");
            System.out.println("First insert some contacts...!");
        }

    }

    public static void searchContact(ArrayList<Contacts> contacts){

        if (!contacts.isEmpty()){

            Scanner ip = new Scanner(System.in);
            System.out.println("Search Contact Details\n");
            System.out.print("Enter the Mobile Number : ");
            mobNo = ip.nextLong();

            for (Contacts elem : contacts){
                if (elem.getMobNo()==mobNo){
                    System.out.println(elem);
                }
            }

        }
        else {
            System.out.println("The Contact List is empty...!");
            System.out.println("First insert some contacts...!");
        }

    }

    public static void modifyContact(ArrayList<Contacts> contacts){

        if (!contacts.isEmpty()){

            Scanner input = new Scanner(System.in);

            System.out.println("Modify Contact Details\n");
            System.out.println("1. Modify Name ");
            System.out.println("2. Modify Mobile Number ");
            System.out.println("3. Modify Email ID ");
            System.out.print("\nEnter the option : ");
            int op = input.nextInt();
            input.nextLine();

            boolean flag = false;

            switch (op){

                case 1 : {

                    System.out.print("Enter the Name: ");
                    name = input.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = input.nextLine();

                    Contacts demo = null;
                    for (Contacts elem : contacts){
                        if (elem.getName().equalsIgnoreCase(name)){
                            demo = elem;
                            flag = true;
                        }
                    }
                    assert demo != null;
                    demo.setName(newName);

                }break;

                case 2 : {

                    System.out.print("Enter the Mobile Number : ");
                    mobNo = input.nextLong();
                    System.out.print("Enter New Mobile Number : ");
                    long newMobNo = input.nextLong();

                    Contacts demo =null;
                    for (Contacts elem : contacts){
                        if (elem.getMobNo()==mobNo){
                            demo = elem;
                            flag = true;
                        }
                    }
                    assert demo != null;
                    demo.setMobNo(newMobNo);


                }break;

                case 3 : {

                    System.out.print("Enter the Email ID : ");
                    email = input.next();
                    input.nextLine();
                    System.out.print("Enter New Email ID : ");
                    String  newEmail = input.nextLine();

                    Contacts demo =null;
                    for (Contacts elem : contacts){
                        if (elem.getEmail().equalsIgnoreCase(email)){
                            demo = elem;
                            flag = true;
                        }
                    }
                    assert demo != null;
                    demo.setEmail(newEmail);

                }break;

                default:
                    System.out.println("Wrong Input");
                    modifyContact(contacts);
            }

            if (flag){
                System.out.println("Successfully Modify the Contact...!");
            }
            else {
                System.out.println("Record not found...!");
                System.out.println("Please enter it again...!");
                modifyContact(contacts);
            }
        }
        else {
            System.out.println("The Contact List is empty...!");
            System.out.println("First insert some contacts...!");
        }


    }


}
