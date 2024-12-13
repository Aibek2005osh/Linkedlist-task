package task1.service;

import task1.models.Student;

import java.util.LinkedList;

public interface StudentService {

    void addStudent(Student student);

    LinkedList<Student> getAll();

    boolean uptadeStudent(Long id, Student newStudent);

    Student getById (Long id);

    boolean deleteSrudent(Long id);


}
