package com.coderbd.repo;

import com.coderbd.entity.ShortestPathResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortestPathResultRepo extends JpaRepository<ShortestPathResult, Long> {
}
