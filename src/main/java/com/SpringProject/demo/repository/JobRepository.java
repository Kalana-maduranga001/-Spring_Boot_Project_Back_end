package com.SpringProject.demo.repository;

import com.SpringProject.demo.entity.JOB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JOB , Integer> {

}
