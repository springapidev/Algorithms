package com.coderbd.quiz19.repo;

import com.coderbd.quiz19.entity.Privilize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PrivilizeRepo extends JpaRepository<Privilize, Long> {
    Privilize findByPrivilizeName(String privilizeName);


}
