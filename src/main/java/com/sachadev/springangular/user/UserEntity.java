package com.sachadev.springangular.user;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    @NotNull
    private String _name;
    @NotNull
    private String _email;

    public UserEntity(long idUser, String _name, String _email) {
        this.idUser = idUser;
        this._name = _name;
        this._email = _email;
    }

    public UserEntity(String _name, String _email) {
        this._name = _name;
        this._email = _email;
    }

    public UserEntity() { }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long id) {
        this.idUser = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_email() {
        return _email;
    }

    public void set_email(String email) {
        this._email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + idUser +
                ", name='" + _name + '\'' +
                ", email='" + _email + '\'' +
                '}';
    }

}
