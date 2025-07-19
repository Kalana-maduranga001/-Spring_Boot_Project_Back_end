package com.SpringProject.demo.repository;

import com.SpringProject.demo.entity.JOB;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JOB , Integer> {

   @Transactional
   @Modifying
   @Query(value = "update JOB set status = 'Deactivate' where id = ?", nativeQuery = true)
   void deactivateJobService(String id);

    @Transactional
    @Modifying
    @Query(value = "update JOB set status = 'Activate' where id = ?", nativeQuery = true)
    void activateJobService(String id);

}
