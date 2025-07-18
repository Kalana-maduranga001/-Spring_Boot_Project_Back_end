package com.SpringProject.demo.contoller;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/job")
@RequiredArgsConstructor
public class JobController {

    private final JobService jobService;

    @PostMapping("create")
    public void createJob(@RequestBody JobDto jobDto) {
        jobService.SaveJob(jobDto);
    }

    @PutMapping("update")
    public void updateJob(@RequestBody JobDto jobDto) {
        jobService.UpdateJob(jobDto);
    }


}
