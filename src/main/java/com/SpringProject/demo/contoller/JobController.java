package com.SpringProject.demo.contoller;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.entity.JOB;
import com.SpringProject.demo.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDto jobDto) {
        jobService.SaveJob(jobDto);
    }
}
