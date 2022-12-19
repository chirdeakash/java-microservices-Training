package com.pension.app;
import javax.annotation.Generated;
import javax.persistence.*;

@Entity(name="pensiondetails")
@Table(name="pensiondetails")
public class Pension {
    @Id

    @Column
    private int id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int balance;
    @Column
    private String mobile;
    @Column
    private String empStatus;
    @Column
    private String pensionStatus;
    @Column
    private String pensionMMYY;
    @Column
    private int installment;

    public Pension() {
    }

    public Pension(int id, String name, int age, int balance, String mobile, String empStatus, String pensionStatus, String pensionMMYY, int installment) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.mobile = mobile;
        this.empStatus = empStatus;
        this.pensionStatus = pensionStatus;
        this.pensionMMYY = pensionMMYY;
        this.installment = installment;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

    public String getPensionStatus() {
        return pensionStatus;
    }

    public void setPensionStatus(String pensionStatus) {
        this.pensionStatus = pensionStatus;
    }

    public String getPensionMMYY() {
        return pensionMMYY;
    }

    public void setPensionMMYY(String pensionMMYY) {
        this.pensionMMYY = pensionMMYY;
    }

    public int getInstallment() {
        return installment;
    }

    public void setInstallment(int installment) {
        this.installment = installment;
    }


    @Override
    public String toString() {
        return "Pension{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", balance=" + balance +
                ", mobile='" + mobile + '\'' +
                ", empStatus='" + empStatus + '\'' +
                ", pensionStatus='" + pensionStatus + '\'' +
                ", pensionMMYY='" + pensionMMYY + '\'' +
                ", installment=" + installment +
                '}';

    }
}