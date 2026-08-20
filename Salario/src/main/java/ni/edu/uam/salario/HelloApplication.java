package ni.edu.uam.salario;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        Label lblTitulo = new Label("Salario UAM");

        Label lblIngrese = new Label("Ingrese su salario");
        TextField tfSalario = new TextField();

        Button btnCalcular = new Button("Calcular");

        Label lblSeguro = new Label("Seguro Social: 0");
        Label lblBono = new Label("Bono: 0");
        Label lblSalarioFinal = new Label("Salario final: 0");

        root.getChildren().addAll(lblTitulo, lblIngrese, tfSalario, btnCalcular, lblSeguro, lblBono, lblSalarioFinal);

        btnCalcular.setAlignment(Pos.CENTER);
        btnCalcular.setPadding(new Insets(20));
        btnCalcular.setStyle("-fx-border-color: #0099ab; -fx-border-radius: 0.5");

        btnCalcular.setOnAction(actionEvent -> {
            double  salariot = Integer.parseInt(tfSalario.getText());
            double seguro = salariot * 0.07;
            double bono;
            double finals;

            if (salariot < 12000) {
                bono = salariot * 0.1;
            } else if (salariot >= 12000 && salariot <= 20000) {
                bono = salariot * 0.05;
            } else {
                bono = salariot * 0.03;
            }

            double salarioFinal = salariot - seguro + bono;

            lblSeguro.setText("Seguro Social: " + seguro);
            lblBono.setText("Bono: " + bono);
            lblSalarioFinal.setText("Salario final: " + salarioFinal);

        });

        Scene scene = new Scene(root, 300, 320);
        stage.setTitle("UAM");
        stage.setScene(scene);
        stage.show();
    }
}
