package com.testspring.frameworkspringtest.models.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.testspring.frameworkspringtest.models.entities.Admin;;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}