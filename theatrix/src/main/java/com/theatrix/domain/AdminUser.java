package com.theatrix.domain;

/**
 * Created by Kino on 2017-11-05.
 */
public class AdminUser
{
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


    public AdminUser() {
    }

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

    public AdminUser(Builder build){
        this.id = build.id;
        this.name = build.name;
        this.surname = build.surname;
        this.password = build.password;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String surname;
        private String password;

        public Builder userID(long value){
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
        public Builder password(String value){
            this.password = value;
            return this;
        }


        public AdminUser build(){
            return new AdminUser(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminUser)) return false;

        AdminUser adminUser = (AdminUser) o;

        return getId().equals(adminUser.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
