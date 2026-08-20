package ni.edu.uam.promsalario;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);
        root.setStyle("-fx-background-color: #0099ab");

        Label lblTitulo = new Label("Salarios UAM");

        Label lblEmpleadoN = new Label("Ingrese la cantidad de empleados");
        TextField tfEmpleados = new TextField();

        Button btnIngresar = new Button("Ingresar salarios");

        Label lblSalario = new Label("Ingrese el salario");
        TextField tfSalario = new TextField();

        Button btnGuardar = new Button("Guardar salario");
        Button btnCalcular = new Button("Calcular");

        Label lblMayor = new Label("Salario más alto: 0");
        Label lblMenor = new Label("Salario más bajo: 0");
        Label lblPromedio = new Label("Promedio: 0");
        Label lblModa = new Label("Moda: 0");

        root.getChildren().addAll(
                lblTitulo, lblEmpleadoN, tfEmpleados, btnIngresar, lblSalario, tfSalario, btnGuardar, btnCalcular, lblMayor, lblMenor, lblPromedio, lblModa
        );

        final int[] cantidad = {0};
        final int[] posicion = {0};
        final double[][] salarios = {null};

        btnIngresar.setOnAction(actionEvent -> {
            cantidad[0] = Integer.parseInt(tfEmpleados.getText());
            salarios[0] = new double[cantidad[0]];
            posicion[0] = 0;


            tfSalario.setDisable(false);
            btnGuardar.setDisable(false);
        });

        btnGuardar.setOnAction(actionEvent -> {

            if (posicion[0] < cantidad[0]) {

                double salario = Double.parseDouble(tfSalario.getText());

                salarios[0][posicion[0]] = salario;

                posicion[0]++;

                tfSalario.clear();

                if (posicion[0] == cantidad[0]) {
                    btnGuardar.setDisable(true);
                    tfSalario.setDisable(true);
                }
            }
        });

        btnCalcular.setOnAction(actionEvent -> {

            double mayor = salarios[0][0];
            double menor = salarios[0][0];
            double suma = 0;

            for (int i = 0; i < cantidad[0]; i++) {

                if (salarios[0][i] > mayor) {
                    mayor = salarios[0][i];
                }

                if (salarios[0][i] < menor) {
                    menor = salarios[0][i];
                }

                suma = suma + salarios[0][i];
            }

            double promedio = suma / cantidad[0];

            double moda = salarios[0][0];
            int mayorRepeticiones = 0;

            for (int i = 0; i < cantidad[0]; i++) {

                int repeticiones = 0;

                for (int j = 0; j < cantidad[0]; j++) {

                    if (salarios[0][i] == salarios[0][j]) {
                        repeticiones++;
                    }
                }

                if (repeticiones > mayorRepeticiones) {
                    mayorRepeticiones = repeticiones;
                    moda = salarios[0][i];
                }
            }

            lblMayor.setText("Salario más alto: " + mayor);
            lblMenor.setText("Salario más bajo: " + menor);
            lblPromedio.setText("Promedio: " + promedio);
            lblModa.setText("Moda: " + moda);
        });

        btnGuardar.setDisable(true);
        tfSalario.setDisable(true);

        Scene scene = new Scene(root, 350, 450);

        stage.setTitle("UAM");
        stage.setScene(scene);
        stage.show();
    }
}