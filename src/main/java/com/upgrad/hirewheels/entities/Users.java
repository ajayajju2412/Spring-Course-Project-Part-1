package com.upgrad.hirewheels.entities;



import javax.persistence.*;

@Entity
public class Users {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId ;

    @Column(nullable = false)
    private String firstName ;

    private String lastName ;

    @Column(nullable = false, columnDefinition = "VARCHAR2(50) CHECK (LENGTH(password) > 5)")
    private String password ;

    @Column(nullable = false, unique = true)
    private String email ;

    @Column(nullable = false, unique = true)
    private String mobileNo ;

    @Column(columnDefinition = "NUMBER(10,2) DEFAULT 100000.00")
    private double walletMoney ;

    public Users() {
    }

    public Users(String firstName, String lastName, String password, String email, String mobileNo, double walletMoney) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.mobileNo = mobileNo;
        this.walletMoney = walletMoney;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public double getWalletMoney() {
        return walletMoney;
    }

    public void setWalletMoney(double walletMoney) {
        this.walletMoney = walletMoney;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", walletMoney=" + walletMoney +
                '}';
    }
}
