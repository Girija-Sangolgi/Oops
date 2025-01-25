package com.xworkz.college;

import com.xworkz.college.dao.CollegeDao;
import com.xworkz.college.dto.CollegeDto;

public class CollegeRunner {

    public static void main(String[] args) {

        CollegeDto dto = new CollegeDto("girija","1ak20cs025");
        CollegeDao collegeDao = new CollegeDao();

       CollegeDto value = collegeDao.collegeDetails(dto);
        System.out.println(value.getName());

    }
}
