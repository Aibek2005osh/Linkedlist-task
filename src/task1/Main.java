package task1;

import task1.db.Databese;
import task1.doa.Impl.StudentDaoImpl;
import task1.models.Student;
import task1.service.Impl.StudentServiceImpl;


import java.time.LocalDate;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        StudentServiceImpl studentService = new StudentServiceImpl(studentDao);

        studentService.addStudent(new Student("Kanchoro", "Kanchoro@gmail.com", LocalDate.of(2003, 10, 7), 999.00, "javaScript"));
        studentService.addStudent(new Student("Amir", "Amir@gmail.com", LocalDate.of(2006, 11, 6), 9999.02, "java"));
        studentService.addStudent(new Student("Muhammedaly", "Muhammedaly.com", LocalDate.of(2004, 10, 7), 10000.01, "javaScript"));
        studentService.addStudent(new Student("Aibek", "Aibek@gmail.com", LocalDate.of(2005, 1, 14), 9999.01, "java"));
        studentService.addStudent(new Student("Baiel", "Baiel@gmail.com", LocalDate.of(2004, 12, 18), 9999.03, "java"));

        studentDao.sortByName();
        System.out.println(studentService.getAll());

        studentDao.sortByPoint();
        System.out.println(studentService.getAll());

        studentDao.sortByGroup();
        System.out.println(studentService.getAll());

//       System.out.println(databese.studentsLinked);   System.out.println("updete  :");
//        studentService.uptadeStudent(1L, new Student("asad", "adsda", LocalDate.of(1231, 3, 3), 12.3, "dsadsada"));
//        System.out.println(studentService.getAll());
//        System.out.println("delet :");
//        studentService.deleteSrudent(1L);
//        System.out.println(studentService.getAll());
//
//        System.out.println("studentService.getById : " + studentService.getById(1L));


    }


}
