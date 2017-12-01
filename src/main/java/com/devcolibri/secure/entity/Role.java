package com.devcolibri.secure.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Role {

    /*   create table role(id int NOT NULL AUTO_INCREMENT, role varchar(64) not null, PRIMARY KEY ( id ) );
     */
    private int id;
    private String role;


    public Role(String role) {
        this.role = role;
    }

    public Role() {

    }

    public Role(int id, String role) {
        this.id = id;
        this.role = role;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, precision = 5, scale = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "role", nullable = false, length = 64)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
