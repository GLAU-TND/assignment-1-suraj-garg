package bylinkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class Tasks {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> linkedList = new LinkedList<>();

    public void addContact(LinketList1 linketList1){
        System.out.println("you have chosen to add a new contact : \n" +
                "please enter the name of the person");
        System.out.println("First Name : ");
        String firstName = scanner.nextLine().trim();
        while(true) {
            if (firstName.matches("[A-Za-z]+")) {
                break;
            } else {
                System.out.println("please enter correct name");
            }
            firstName = scanner.nextLine().trim();
        }
        System.out.println("Last Name : ");
        String lastname = scanner.nextLine().trim();
        while(true){
            if(lastname.matches("[A-Za-z]+")){
                break;
            }
            else{
                System.out.println("please enter correct name");
            }
            lastname = scanner.nextLine().trim();
        }
        System.out.println("Contact Number : ");
        while(true){
            String contact = scanner.nextLine().trim();
            if(contact.matches("[0-9]{10}")){
                linkedList.add(contact);
                break;
            }
        }
        while (true){
            System.out.println("would you like to add another contact number? (y/n): ");
            char choice = scanner.next().charAt(0);
            if(choice=='y'){
                System.out.println("Contact Number : ");
                String contactNumber1 = scanner.nextLine().trim();
                while(true){
                    if(contactNumber1.matches("[0-9]{10}")){
                        linkedList.add(contactNumber1);
                        break;
                    }
                    else{
                        System.out.println("Add correct number");
                    }

                }
            }
            else{
                break;
            }
            System.out.println("Enter your Email Address : ");
            scanner.nextLine();
            while(true){
                String temp = scanner.nextLine();
                if(temp.matches("^[a-z]+[0-9]*@[a-z]+\\.[a-z]+$")){
                    linketList1.addLast(new Person(firstName, lastname, linkedList, temp));
                    break;
                }
                else{
                    System.out.println("Invalid Email Address ! Enter Again");
                }
            }

        }

    }
    public void viewContact(LinketList1 linketList1){
        System.out.println("---Here are all your contacts---");
        if (linketList1.isEmpty()){
            linketList1.display();
        }
        else{
            System.out.println("No Result Found");
        }
    }

    public void deleteContact(LinketList1 linketList1){
        if (!linketList1.isEmpty()){
            System.out.println("Here are all the contacts : Press the number against" +
                    "to delete the conatct");
            linketList1.displayOne();
            int choice = scanner.nextInt();
            scanner.nextLine();
            linketList1.deleteNode(choice);
            linketList1.displayOne();
            System.out.println("Deleted..!!");
        }
        else{
            System.out.println("No contacts. you must need to contacts before you could delete..");
        }
    }


    public void searchContact(LinketList1 linketList1){
        System.out.println("you could search from a conatct from their first names : ");
        String firstName = scanner.nextLine().trim();
        if (LinketList1.indexOf(firstName) >=0){
            System.out.println("Match Found");
            linketList1.getNode(linketList1.indexOf(firstName));
        }
        else {
            System.out.println("No Match Found");
        }
    }



}
