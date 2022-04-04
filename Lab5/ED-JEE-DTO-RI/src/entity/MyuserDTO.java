/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Matthew Coulter
 */
public class MyuserDTO implements Serializable {

    private final String userid;
    private final String name;
    private final String password;
    private final String email;
    private final String phone;
    private final String address;
    private final String secQn;
    private final String secAns;

    public String getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getSecQn() {
        return secQn;
    }

    public String getSecAns() {
        return secAns;
    }

    public MyuserDTO(String userid, String name, String password, String email, String phone, String address, String secQn, String secAns) {
        this.userid = userid;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.secQn = secQn;
        this.secAns = secAns;
    }
}
