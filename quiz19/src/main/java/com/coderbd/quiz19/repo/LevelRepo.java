package com.coderbd.quiz19.repo;

import com.coderbd.quiz19.entity.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelRepo extends JpaRepository<Level, Long> {
}
