package com.testspring.frameworkspringtest.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasien")
public class Pasien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pasien")
    private Integer idPasien;

    @Column(name = "nama_pasien")
    private String namaPasien;

    @Column(name = "email_pasien")
    private String emailPasien;

    @Column(name = "password_pasien")
    private Integer passwordPasien;

    // Constructor, getters, and setters

    public Pasien() {
    }

    public Pasien(String namaPasien, String emailPasien, Integer passwordPasien) {
        this.namaPasien = namaPasien;
        this.emailPasien = emailPasien;
        this.passwordPasien = passwordPasien;
    }

    public Integer getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(Integer idPasien) {
        this.idPasien = idPasien;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getEmailPasien() {
        return emailPasien;
    }

    public void setEmailPasien(String emailPasien) {
        this.emailPasien = emailPasien;
    }

    public Integer getPasswordPasien() {
        return passwordPasien;
    }

    public void setPasswordPasien(Integer passwordPasien) {
        this.passwordPasien = passwordPasien;
    }
}
