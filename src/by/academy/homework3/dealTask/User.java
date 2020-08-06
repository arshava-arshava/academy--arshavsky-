package by.academy.homework3.dealTask;

import java.util.Date;

public class User {

    private String name;
    private String type;
    private String phone;
    private String email;
    private Date dateOfBirth;


    public User() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setType(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }


    public User(String name, String type) {
        super();
        this.name = name;
        this.type = type;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    void speak() {
        System.out.println("Hi! My name is: " + name + "," + "I am a " + type);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [name=");
        builder.append(name);
        builder.append(", phone=");
        builder.append(phone);
        builder.append(", email=");
        builder.append(email);
        builder.append(", dateOfBirth=");
        builder.append(dateOfBirth);
        builder.append("]");
        return builder.toString();
    }

}


