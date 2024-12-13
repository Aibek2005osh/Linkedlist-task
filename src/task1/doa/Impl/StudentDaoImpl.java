package task1.doa.Impl;

import task1.db.Databese;
import task1.doa.StudentDoa;
import task1.models.Student;

import java.util.Comparator;
import java.util.LinkedList;

public class StudentDaoImpl implements StudentDoa {

    private final Databese databese = new Databese();



    @Override
    public void addStudent(Student student) {
        databese.studentsLinked.add(student);

    }

    @Override
    public LinkedList<Student> getAll() {

        return databese.studentsLinked;
    }

    @Override
    public boolean uptadeStudent(Long id, Student newStudent) {
        boolean isblok = false;

        for (Student student : databese.studentsLinked) {
            if (student.getId().equals(id)) {
                isblok = true;
                student.setId(id);
                student.setFirstName(newStudent.getFirstName());
                student.setEmail(newStudent.getEmail());
                student.setYearzOfbirth(newStudent.getYearzOfbirth());
                student.setPoint(newStudent.getPoint());
                student.setGroup(newStudent.getGroup());
            }

        }

        return isblok;

    }

    @Override
    public Student getById(Long id) {
        for (Student student : databese.studentsLinked) {
            if (student.getId().equals(id)) {
                return student;
            }

        }
        return null;
    }

    @Override
    public boolean deleteSrudent(Long id) {
        Student getByIdStudent = getById(id) ;

        if (getByIdStudent != null)

                databese.studentsLinked.remove(getByIdStudent); return false;
            }

    @Override
    public void sortByName() {
        databese.studentsLinked.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });
    }

    @Override
    public void sortByPoint() {
        databese.studentsLinked.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return(o2.getPoint().compareTo(o1.getPoint()));
            }
        });
    }

    @Override
    public void sortByGroup() {
        databese.studentsLinked.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGroup().compareTo(o2.getGroup());
            }
        });
    }


}
