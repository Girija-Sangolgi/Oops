package com.xworkz.college.dto;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.dao.CollegeDao;

public class CollegeDto {

    private String name;
    private String usn;




    public CollegeDto(String name, String usn) {
        this.name=name;
        this.usn=usn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getName() {
        return name;
    }

    public String getUsn() {
        return usn;
    }



}
