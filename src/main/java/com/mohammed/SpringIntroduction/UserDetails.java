package com.mohammed.SpringIntroduction;

public class UserDetails {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String addressLine;
    private final String gender;

    public UserDetails(long id, String firstName, String lastName, int age, String addressLine, String gender){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.addressLine = addressLine;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public String getGender() {
        return gender;
    }
}
