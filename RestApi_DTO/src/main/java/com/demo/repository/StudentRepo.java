package com.demo.repository;
import com.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;




public interface StudentRepo extends JpaRepository<Student,Integer> {

}
