package com.mycompany.kythuatphanmem;

public class Student {

    private String name;
    private String day;
    private String month;
    private String year;
    private String phone;
    private String gender;
    private String className;
    private String score;  // Lưu dưới dạng String như bạn đang dùng

    public Student() {
    }

    public Student(String name, String day, String month, String year, String phone, String gender, String className, String score) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.phone = phone;
        this.gender = gender;
        this.className = className;
        this.score = score;
    }

    // Các getter và setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    // Phương thức trả về ngày sinh dạng dd/mm/yyyy
    public String getBirth() {
        return day + "/" + month + "/" + year;
    }

    
    public String getXMLString(){
    return  "<student>\n" +
"        <name>"+name+"</name>\n" +
"        <birthDay>"+day+"</birthDay>\n" +
"        <birthMonth>"+month+"</birthMonth>\n" +
"        <birthYear>"+year+"</birthYear>\n" +
"        <phone>"+phone+"</phone>\n" +
"        <gender>"+gender+"</gender>\n" +
"        <class>"+className+"</class>\n" +
"        <score>"+score+"</score>\n" +
"    </student>";
    }

}
