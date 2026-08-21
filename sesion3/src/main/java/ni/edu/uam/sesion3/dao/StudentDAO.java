package ni.edu.uam.sesion3.dao;

import ni.edu.uam.sesion3.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDAO {
    private List<Student> students;
    public StudentDAO() {
        students = new ArrayList<>();
    }

    public void add(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageGrade() {
        double averageGrade = 0;
        return students.stream().mapToDouble(Student::getGrade).average().getAsDouble();
    }

}
