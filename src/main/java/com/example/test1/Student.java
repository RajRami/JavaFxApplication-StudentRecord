package com.example.test1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    /**
     * Create instance variables of our model class
     */
    private int studentNum;
    private String firstName, lastName, gender, telephone, province;
    private int avgGrade;
    private String majorCode;

    /**
     * Creating a constructor of model class
     * @param studentNum
     * @param firstName
     * @param lastName
     * @param gender
     * @param telephone
     * @param province
     * @param avgGrade
     * @param majorCode
     */
    public Student(int studentNum, String firstName, String lastName, String gender, String telephone, String province, int avgGrade, String majorCode) {
        setStudentNum(studentNum);
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setTelephone(telephone);
        setProvince(province);
        setMajorCode(majorCode);
        setAvgGrade(avgGrade);
    }

    /**
     * Creating Getters and setters methods for all instance variables
     */
    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum)
    {
        //The student number must be between 200034000 to 200070000
        if(studentNum > 200034000 && studentNum < 200070000)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("Invalid Student#, The student number must be between 200034000 to 200070000");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        //First name Should have at least  2 character
        //it will remove extra spaces
        firstName = firstName.trim();
        if (firstName.length() >= 1)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Invalid first name, must be 1 or more character");
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        //last name should have at least 2 character
        //it will remove extra spaces
        lastName = lastName.trim();
        if (lastName.length() >= 1)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Invalid last name, must be 1 or more character");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone)
    {
        //Telephone number should match the North American dialing plan (NXX NXX-XXXX, where N denotes 2–9, and X is any digit 0–9).
        if(telephone.matches("\\(?[2-9]\\d{2}\\)?[-\\s]?[2-9]\\d{2}[-\\s]?\\d{4}"))
            this.telephone = telephone;
        else
            throw new IllegalArgumentException("Invalid phone, Please enter valid 10 digit number");
    }

    public String getProvince() {
        return province;
    }

    public static List<String> getProvinceName()
    {
        //Province should be in the list of "AB","BC","MB","NB","NL","NS","NT","NU","ON","PE","QC","SK","YT"
        List<String> provinceName= Arrays.asList("AB", "BC", "MB", "NB", "NL", "NS", "NT", "NU", "ON", "PE", "QC", "SK", "YT");
        Collections.sort(provinceName);
        return provinceName;
    }
    public void setProvince(String province) {



        List<String> provinceName = getProvinceName();
        if(provinceName.contains(province))
            this.province = province;
        else
            throw new IllegalArgumentException(province + " is not valid, choose one from this list" + provinceName);
    }

    public String getMajorCode() {
        return majorCode;
    }

    public void setMajorCode(String majorCode)
    {
        //Major Code must have 4 upper case letters only
        if(majorCode == majorCode.toUpperCase())
            this.majorCode = majorCode;
        else
            throw new IllegalArgumentException("Major Code must have all 4 upper case letters only");
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {

        //Average grade must be in the range of 0-100
        if (avgGrade >= 0 && avgGrade <= 100)
            this.avgGrade = avgGrade;
        else
            throw new IllegalArgumentException("Average grade must be in the range of 0-100");
    }
}
