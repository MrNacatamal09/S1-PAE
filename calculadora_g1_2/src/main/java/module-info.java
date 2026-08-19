module ni.edu.uam.calculadora_g1_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.calculadora_g1_2 to javafx.fxml;
    exports ni.edu.uam.calculadora_g1_2;
}