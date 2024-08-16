package com.himanshu.repo;

import com.himanshu.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Optional<Student> findByMob(String mobile);
}
