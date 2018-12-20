package com.coderbd.repo;

import com.coderbd.entity.ShortestPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortestPathRepo extends JpaRepository<ShortestPath, Long> {
}
