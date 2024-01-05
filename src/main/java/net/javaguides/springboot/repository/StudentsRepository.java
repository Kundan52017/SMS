package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.entity.Students;


public interface StudentsRepository extends JpaRepository<Students,Long>{

}
