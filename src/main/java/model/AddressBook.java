package model;

import javax.persistence.*;

@Entity
@Table(name = "addressbook")
public class AddressBook extends People{
    private long id;
    private String name;
    private String address;

    public AddressBook() {
    }

    public AddressBook(final long id, final String name, final String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
