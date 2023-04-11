package com.UST.interviewSchedule.service;

import com.UST.interviewSchedule.entity.Interview;
import com.UST.interviewSchedule.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class InterviewService{
        @Autowired
        private InterviewRepository repo;
        public Interview createSchedule(Interview interview) {
            return repo.save(interview);
        }

        public List<Interview> getSchedule() {
            return  repo.findAll();
        }

        public Interview getEmployeeById(Long id) {
            return repo.findById(id).orElse(null);

        }
    }


