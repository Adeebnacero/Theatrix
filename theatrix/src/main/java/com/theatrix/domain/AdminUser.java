package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class AdminUser
{

    public AdminUser(Long id) {
        this.id = id;
    }

    private Long id;
    private String name;
    private String surname;
    private String password;

    //***************************************Setters*******************************************

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //***************************************Getters*******************************************


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }


}
