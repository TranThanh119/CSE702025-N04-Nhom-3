package com.mycompany.kythuatphanmem;

import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class StudentHandler extends DefaultHandler {

    private List<Student> studentList = new ArrayList<>();
    private Student currentStudent = null;

    private boolean isName = false, isPhone = false, isGender = false, isClass = false, isBirth = false, isScore = false;
    private boolean isBirthDay = false, isBirthMonth = false, isBirthYear = false;

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            currentStudent = new Student();
        } else if (qName.equalsIgnoreCase("name")) {
            isName = true;
        } else if (qName.equalsIgnoreCase("birth")) {
            isBirth = true;
        } else if (qName.equalsIgnoreCase("phone")) {
            isPhone = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            isGender = true;
        } else if (qName.equalsIgnoreCase("class")) {
            isClass = true;
        } else if (qName.equalsIgnoreCase("score")) {
            isScore = true;
        } else if (qName.equalsIgnoreCase("birthDay")) {
            isBirthDay = true;
        } else if (qName.equalsIgnoreCase("birthMonth")) {
            isBirthMonth = true;
        } else if (qName.equalsIgnoreCase("birthYear")) {
            isBirthYear = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("student")) {
            studentList.add(currentStudent);
        } else if (qName.equalsIgnoreCase("name")) {
            isName = false;
        } else if (qName.equalsIgnoreCase("birth")) {
            isBirth = false;
        } else if (qName.equalsIgnoreCase("phone")) {
            isPhone = false;
        } else if (qName.equalsIgnoreCase("gender")) {
            isGender = false;
        } else if (qName.equalsIgnoreCase("class")) {
            isClass = false;
        } else if (qName.equalsIgnoreCase("score")) {
            isScore = false;
        } else if (qName.equalsIgnoreCase("birthDay")) {
            isBirthDay = false;
        } else if (qName.equalsIgnoreCase("birthMonth")) {
            isBirthMonth = false;
        } else if (qName.equalsIgnoreCase("birthYear")) {
            isBirthYear = false;
        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (currentStudent == null) {
            return;
        }

        String value = new String(ch, start, length).trim();
        if (value.isEmpty()) {
            return;
        }

        if (isName) {
            currentStudent.setName(value);
        } else if (isBirth) {
            // birth = dd/MM/yyyy
            String[] parts = value.split("/");
            if (parts.length == 3) {
                currentStudent.setDay(parts[0]);
                currentStudent.setMonth(parts[1]);
                currentStudent.setYear(parts[2]);
            }
        } else if (isBirthDay) {
            currentStudent.setDay(value);
        } else if (isBirthMonth) {
            currentStudent.setMonth(value);
        } else if (isBirthYear) {
            currentStudent.setYear(value);
        } else if (isPhone) {
            currentStudent.setPhone(value);
        } else if (isGender) {
            currentStudent.setGender(value);
        } else if (isClass) {
            currentStudent.setClassName(value);
        } else if (isScore) {
            currentStudent.setScore(value);
        }
    }

}
