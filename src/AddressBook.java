import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();

    private String AddressBook;

    public String getAddressBook() {
        return AddressBook;
    }

    public void setAddressBook(String addressBook) {
        AddressBook = addressBook;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contacts=" + contacts +
                ", AddressBook='" + AddressBook + '\'' +
                '}';
    }

    void add(){
        Contact contact = new Contact();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the fist name ");
        String name = sc.next();
        contact.setName(name);
        System.out.print("Enter the last name ");
        String lname = sc.next();
        contact.setLastname(lname);
        System.out.print("Enter address ");
        String add = sc.next();
        contact.setAddress(add);
        contacts.add(contact);
    }
}
