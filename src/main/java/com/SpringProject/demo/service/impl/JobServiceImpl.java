package com.SpringProject.demo.service.impl;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.entity.JOB;
import com.SpringProject.demo.repository.JobRepository;
import com.SpringProject.demo.service.JobService;
import lombok.RequiredArgsConstructor;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import javax.swing.event.ListDataEvent;
import java.util.List;

@Service
@RequiredArgsConstructor

public class JobServiceImpl implements JobService {

    public final JobRepository jobRepository;
    private final ModelMapper modelMapper;

    @Override
    public void SaveJob(JobDto jobDto) {
        jobRepository.save(modelMapper.map(jobDto , JOB.class));
    }

    @Override
    public void UpdateJob(JobDto jobDto) {
        jobRepository.save(modelMapper.map(jobDto , JOB.class));
    }

    @Override
    public List<JobDto> getAllJobs() {
        List<JOB> allJobs = jobRepository.findAll();
        return modelMapper.map(allJobs , new TypeToken<List<JobDto>>(){}.getType());
    }

    @Override
    public void DeactivateJobStatus(String id) {
        jobRepository.deactivateJobService(id);
    }

    @Override
    public void ActivateJobStatus(String id) {
        jobRepository.activateJobService(id);
    }


//    @Override
//    public List<JobDto> searchJobs(String keyword) {
//        return List.of();
//    }


}
