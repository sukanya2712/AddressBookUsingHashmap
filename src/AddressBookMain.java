import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {
    HashMap<String,AddressBook> hashMap=new HashMap<String,AddressBook>();
    void addaddressBook(){
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        System.out.println("Enter name of the addressbook");
        addressBook.setAddressBook(sc.next());
//        addressBook.add();
        hashMap.put(addressBook.getAddressBook(),addressBook);
        System.out.println("Address book added!!");
    }
    void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the addressbook on which you want to add contact");
        String str = sc.next();
        if(hashMap.containsKey(str)){
            AddressBook temp = hashMap.get(str);
            temp.add();
            System.out.println("Contact added");
        }
    }
    void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the name of the addressbook in which you want to display ");
        String str = sc.next();
        if(hashMap.containsKey(str)){
            AddressBook temp = hashMap.get(str);
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBookMain addressBookMain = new AddressBookMain();
        while (true) {
            System.out.println("Enter the operation do you want to perform: 1) add addressbook 2) add contact 3) display");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    addressBookMain.addaddressBook();
                }
                case 2 -> {
                    addressBookMain.addContact();
                }
                case 3 -> {
                    addressBookMain.display();
                }
            }
        }
    }
}
