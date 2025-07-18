package com.SpringProject.demo.service.impl;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.entity.JOB;
import com.SpringProject.demo.repository.JobRepository;
import com.SpringProject.demo.service.JobService;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class JobServiceImpl implements JobService {

    public final JobRepository jobRepository;
    private final ModelMapper modelMapper;

    @Override
    public void SaveJob(JobDto jobDto) {
        jobRepository.save(modelMapper.map(jobDto , JOB.class));
    }


}
