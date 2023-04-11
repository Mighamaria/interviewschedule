package com.UST.interviewSchedule.repository;

import com.UST.interviewSchedule.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InterviewRepository extends JpaRepository<Interview,Long> {
}
