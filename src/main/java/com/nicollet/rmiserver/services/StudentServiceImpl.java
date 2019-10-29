package com.nicollet.rmiserver.services;

import com.nicollet.rmiserver.models.Student;

import java.util.Date;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public String getStudentFullName(String firstName, String lastName) {
        System.out.println("================Server Side ========================");
        return "Your full name is:  " + firstName + " "+ lastName + " :: Response time - > " + new Date();
    }
}
