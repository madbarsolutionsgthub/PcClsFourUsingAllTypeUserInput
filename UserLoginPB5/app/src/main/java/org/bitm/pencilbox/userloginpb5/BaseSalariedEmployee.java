package org.bitm.pencilbox.userloginpb5;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Mobile App on 5/9/2018.
 */

public class BaseSalariedEmployee implements Serializable{
    private String empName;
    private String empId;
    private String empDesg;
    private String empSalary;
    private String gender;
    private List<String>skills;
    private String city;

    public BaseSalariedEmployee(String empName, String empId, String empDesg, String empSalary, String gender, List<String> skills, String city) {
        this.empName = empName;
        this.empId = empId;
        this.empDesg = empDesg;
        this.empSalary = empSalary;
        this.gender = gender;
        this.skills = skills;
        this.city = city;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpId() {
        return empId;
    }

    public String getEmpDesg() {
        return empDesg;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getSkills() {
        return skills;
    }

    public String getCity() {
        return city;
    }
}
