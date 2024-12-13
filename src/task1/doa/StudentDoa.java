package task1.doa;

import task1.models.Student;

import java.util.LinkedList;

public interface StudentDoa {
    void addStudent(Student student);

    LinkedList<Student> getAll();

    boolean uptadeStudent(Long id, Student newStudent);

    Student getById(Long id);

    boolean deleteSrudent(Long id);

   void sortByName();

   void sortByPoint();

   void sortByGroup();
}
