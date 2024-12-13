package task1.service.Impl;

import task1.db.Databese;
import task1.doa.Impl.StudentDaoImpl;
import task1.models.Student;
import task1.service.StudentService;

import java.util.LinkedList;


public class StudentServiceImpl implements StudentService {
    private final Databese databese = new Databese();
   private final StudentDaoImpl studentDao ;

    public StudentServiceImpl(StudentDaoImpl studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void addStudent(Student student) {
        studentDao.addStudent(student);
        databese.studentsLinked.add(student);
    }

    @Override
    public LinkedList<Student> getAll() {

        return new LinkedList<>(studentDao.getAll());
    }

    @Override
    public boolean uptadeStudent(Long id, Student newStudent) {
        return studentDao.uptadeStudent(id, newStudent);
    }

    @Override
    public Student getById(Long id) {
        return studentDao.getById(id);
    }

    @Override
    public boolean deleteSrudent(Long id) {
      return studentDao.deleteSrudent(id);
    }
}
