package com.coderbd.quiz19.service;

import com.coderbd.quiz19.entity.Privilize;
import org.springframework.data.domain.Page;
import java.util.Optional;


public interface PrivilizeService {
    Privilize save(Privilize privilize);
    Privilize update(Privilize privilize);
    void delete(Long id);
    Optional<Privilize> getPrivilize(Long id);
    Page<Privilize> getAllPrivilizes(int page, int perPageRow);
    Privilize isAlreadyExist(String privilizeName);



}
