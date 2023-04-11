package com.UST.interviewSchedule.controller;

import com.UST.interviewSchedule.entity.Interview;
import com.UST.interviewSchedule.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reg")
public class InterviewController {
    @Autowired
    private InterviewService interviewService;
    @PostMapping("/addinterview")
    public Interview addInterview(@RequestBody Interview interview )

    {
        return interviewService.createSchedule(interview);
    }
    @GetMapping("/interview")
    public List<Interview> getAllSchedules(){
        return  interviewService.getSchedule();
    }
    @GetMapping("/{id}")
    public Interview getAllSchedule(@PathVariable Long id){
        return  interviewService.getEmployeeById(id);
    }
}
