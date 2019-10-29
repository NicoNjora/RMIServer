package com.nicollet.rmiserver.services;

import com.nicollet.rmiserver.models.Student;

public interface StudentService {
   public String getStudentFullName(String firstName, String lastName);
}
