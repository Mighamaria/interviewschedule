package com.UST.interviewSchedule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "interview_tab")
public class Interview {

    @Id
    @GeneratedValue
    private  Long id;
    private  String name;
    private  String emailId;
    private  String phNumber;
    private String skills;
    private  int experience;
    private  String date;
    private  String time;
    private  String link;
    private String poc;



}
