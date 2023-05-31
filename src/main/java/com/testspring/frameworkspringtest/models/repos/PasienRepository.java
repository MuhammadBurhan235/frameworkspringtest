package com.testspring.frameworkspringtest.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testspring.frameworkspringtest.models.entities.Pasien;;

public interface PasienRepository extends JpaRepository<Pasien, Integer> {
    boolean existsByEmailPasien(String emailPasien);
    boolean existsByEmailPasienAndPasswordPasien(String emailPasien, Integer integer);
}