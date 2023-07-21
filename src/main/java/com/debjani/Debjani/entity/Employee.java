package com.debjani.Debjani.entity;


import javax.persistence.*;
@Entity
@Table(name = "EMP_SYSTEM")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String mailId;
    private String phoneNumber;
    private String Salary;

    public Employee(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mailId='" + mailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary='" + Salary + '\'' +
                '}';
    }

}

