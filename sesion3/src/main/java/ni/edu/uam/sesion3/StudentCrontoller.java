package ni.edu.uam.sesion3;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import ni.edu.uam.sesion3.dao.StudentDAO;
import ni.edu.uam.sesion3.models.Student;

public class StudentCrontoller {
    StudentDAO studentDAO = new StudentDAO();

    @FXML
    private TextField txtName;
    @FXML
    private TextField txtGrade;

    @FXML
    Label lblAvg;

    @FXML
    protected void saveBtnClicked() {
        readStudent();
        lblAvg.setText("Promedio: " + studentDAO.getAverageGrade());
    }

    private void readStudent() {
        String name = txtName.getText();
        int grade = Integer.parseInt(txtGrade.getText());
        Student student = new Student(name, grade);
        saveStudent(student);
    }

    private void saveStudent(Student student) {
        studentDAO.add(student);
    }

}
