package com.kris.spring.mvc;

import com.kris.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.*;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2,message = "name must have min 2 symbols")
    private String name;
//    @NotEmpty(message = "surname is required field")
    @NotBlank(message = "surname is required field") // чтобы не пробелы были
    private String surName;
    @Min(value = 500, message = "must be >499")
    @Max(value = 1000,message = "must be < 1001")
    private int salary;
    private String  department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String,String> carBrands;
    private String[] languages;
    private Map<String ,String > languageList;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}",message = "please use pattern xxx-xx-xx")
    private String phoneNumber;
    @CheckEmail(value = "abc.com", message ="email must ends with xyz.com")
    //своя аннотация
    private  String email;

    public Employee() {
        departments=new HashMap<>();
        departments.put("Info tachnologii","it");
        departments.put("Human sources","it");
        departments.put("Sales","sales");

        carBrands=new HashMap<>();
        carBrands.put("bmw", "bmw");
        carBrands.put("audi", "audi");
        carBrands.put("skoda", "skoda");

        languageList=new HashMap<>();
        languageList.put("english", "en");
        languageList.put("deutsch", "de");
        languageList.put("french", "fr");

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
