package com.jermin.myfirstspringboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRep extends JpaRepository<Girl, Integer> {
}
