module ni.edu.uam.promsalario {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.promsalario to javafx.fxml;
    exports ni.edu.uam.promsalario;
}