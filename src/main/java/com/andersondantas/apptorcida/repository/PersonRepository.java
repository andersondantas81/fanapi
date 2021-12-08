package com.andersondantas.apptorcida.repository;

import com.andersondantas.apptorcida.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
