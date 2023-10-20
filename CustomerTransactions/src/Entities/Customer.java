package Entities;

import java.time.LocalDateTime;

public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String nationalityId;
    private LocalDateTime birthYear;

    public Customer(){

    }
    public Customer(int id, String firstName, String lastName, String nationalityId, LocalDateTime birthyear) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalityId = nationalityId;
        this.birthYear = birthyear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public LocalDateTime getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(LocalDateTime birthYear) {
        this.birthYear = birthYear;
    }
}
