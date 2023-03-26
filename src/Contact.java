public class Contact {
    private String name;
    private String lastname;
    private String Address;

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Contact(String name, String lastname, String address) {
        this.name = name;
        this.lastname = lastname;
        Address = address;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
