package com.xworkz.college.dao;

import com.xworkz.college.dto.CollegeDto;

public class CollegeDao {

    CollegeDto dto;

    public CollegeDto collegeDetails(CollegeDto dto){
        if(dto!=null){
            return dto;
        }else System.out.println("please provide valid details...");
        return dto;
    }
}
