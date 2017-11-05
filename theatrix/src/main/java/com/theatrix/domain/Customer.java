package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class Customer
{

    public Customer(Long id) {
        this.id = id;
    }

    public Customer() {
    }

    private Long id;
    private String name;
    private String surname;
    private String cellphone;
    private String email;
    private String age;
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

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(String age) {
        this.age = age;
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

    public String getCellphone() {
        return cellphone;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }


    public Customer(Builder build){
        this.id = build.id;
        this.name =build.name;
        this.surname = build.surname;
        this.cellphone = build.cellphone;
        this.email =build.email;
        this.age =build.age;
        this.password =build.password;
    }



    public static class Builder{
        private Long id;
        private String name;
        private String surname;
        private String cellphone;
        private String email;
        private String age;
        private String password;

        public Builder id(long value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder surname(String value){
            this.surname = value;
            return this;
        }
        public Builder cellphone(String value){
            this.cellphone = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder age(String value){
            this.age = value;
            return this;
        }
        public Builder password(String value){
            this.age = value;
            return this;
        }
        public Customer build(){
            return new Customer(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        return getId().equals(customer.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
