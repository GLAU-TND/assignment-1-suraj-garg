package bylinkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinketList1 linkedlist1 = new LinketList1();
        Tasks tasks = new Tasks();
        System.out.println("welcome to Suraj's Contact List App");
        System.out.println("press 1 to add a new Contact");
        System.out.println("press 2 to view all Contacts");
        System.out.println("press 3 to search for a Contacts");
        System.out.println("press 4 to delete a Contact");
        System.out.println("press 5 to exit a program");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice==1){
            tasks.addContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice==2){
            tasks.viewContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice==3){
            tasks.searchContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice==4){
            tasks.deleteContact(linkedlist1);
            choice = Integer.parseInt(scanner.nextLine());
        }
        if (choice==5){
            System.out.println("App terminate");
        }

    }
}
