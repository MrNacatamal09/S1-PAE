module ni.edu.uam.salario {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ni.edu.uam.salario to javafx.fxml;
    exports ni.edu.uam.salario;
}