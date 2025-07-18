package com.SpringProject.demo.service;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.repository.JobRepository;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

public interface JobService {

    void SaveJob(JobDto jobDto);

}
