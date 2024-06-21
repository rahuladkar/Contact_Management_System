package Contact_Management_System;

public class Contacts {

    private String name;
    private long mobNo;
    private String email;

    // getter() and setter()
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getMobNo() {
        return mobNo;
    }
    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // no argument constructor
    Contacts(){}

    // constructor to initialize the attributes
    Contacts(String name, long mobNo , String email){
        this();
        setName(name);
        setMobNo(mobNo);
        setEmail(email);
    }

    // overridden toString()

    @Override
    public String toString() {
        return "Contacts { " +
                "name = '" + name + '\'' +
                " , mobNo = " + mobNo +
                " , email = '" + email + '\'' + " }";
    }

    @Override
    public boolean equals(Object o) {

        return this.name.equalsIgnoreCase(((Contacts)o).name);
    }

}
