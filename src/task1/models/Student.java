package task1.models;

import java.time.LocalDate;
import java.util.Comparator;

public class Student {
    private Long id;
    private String firstName;
    private String email;
    private LocalDate yearzOfbirth;
    private Double point;
    private String group;

    private static Long generedId = 1L;

    public Student() {
        this.id = generedId++;

    }

    public Student(String firstName, String email, LocalDate yearzOfbirth, Double point, String group) {
        this.id = generedId++;
        this.firstName = firstName;
        this.email = email;
        this.yearzOfbirth = yearzOfbirth;
        this.point = point;
        this.group = group;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getYearzOfbirth() {
        return yearzOfbirth;
    }

    public void setYearzOfbirth(LocalDate yearzOfbirth) {
        this.yearzOfbirth = yearzOfbirth;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;


    }




    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", email='" + email + '\'' +
               ", yearzOfbirth=" + yearzOfbirth +
               ", point=" + point +
               ", group='" + group + '\'' +
               '}' + "\n";
    }

}
