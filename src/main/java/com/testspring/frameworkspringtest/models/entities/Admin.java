package com.testspring.frameworkspringtest.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    private Integer idAdmin;

    @Column(name = "nama_admin")
    private String namaAdmin;

    @Column(name = "email_admin")
    private String emailAdmin;

    @Column(name = "password_admin")
    private String passwordAdmin;

    // Constructor, getters, and setters

    public Admin() {
    }

    public Admin(String namaAdmin, String emailAdmin, String passwordAdmin) {
        this.namaAdmin = namaAdmin;
        this.emailAdmin = emailAdmin;
        this.passwordAdmin = passwordAdmin;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public String getEmailAdmin() {
        return emailAdmin;
    }

    public void setEmailAdmin(String emailAdmin) {
        this.emailAdmin = emailAdmin;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }
}
