package com.SpringProject.demo.service;

import com.SpringProject.demo.dto.JobDto;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;

public interface JobService {

    void SaveJob(JobDto jobDto);
    void UpdateJob(JobDto jobDto);
    List<JobDto> getAllJobs();
    void DeactivateJobStatus(String id);
    void ActivateJobStatus(String id);
    List<JobDto> searchJobs(@PathVariable("keyword") String keyword);


}
