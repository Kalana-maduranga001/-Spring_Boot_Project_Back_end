package com.SpringProject.demo.contoller;

import com.SpringProject.demo.dto.JobDto;
import com.SpringProject.demo.service.JobService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("getAll")
    public List<JobDto> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PatchMapping("D_status/{id}")
    public void changeStatus(@PathVariable String id) {
        jobService.DeactivateJobStatus(id);
    }

    @PatchMapping("A_status/{id}")
    public void changeStatus2(@PathVariable String id) {
        jobService.ActivateJobStatus(id);
    }

    @GetMapping("search/{keyword}")
    public List<JobDto> searchJob(@PathVariable("keyword") String keyword) {
        return jobService.searchJobs(keyword);
    }

}
