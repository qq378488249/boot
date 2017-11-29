package com.blue.boot.repository;

import com.blue.boot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl,Integer> {
}
