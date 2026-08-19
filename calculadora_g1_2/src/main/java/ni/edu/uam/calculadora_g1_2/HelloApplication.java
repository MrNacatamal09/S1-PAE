package ni.edu.uam.calculadora_g1_2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        Label lblTitulo = new Label("Calculadora Base");
        Label lblNumber1= new Label("Numero 1");
        TextField txtNumber1 = new TextField();
        Label lblNumber2 = new Label("Numero 2");
        TextField txtNumber2 = new TextField();
        Label lblAnswer = new Label("0");

        Button btnSum = new Button("+");
        Button btnRest = new Button("-");
        Button btnMulti = new Button("*");
        Button btnDiv = new Button("/");
        HBox buttons = new HBox();
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(10);
        buttons.setPadding(new Insets(20));
        buttons.setStyle("-fx-border-color: #0099ab; -fx-border-radius: 0.5");
        buttons.getChildren().addAll(btnSum, btnRest, btnMulti, btnDiv);

        btnSum.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(txtNumber1.getText());
            int num2 = Integer.parseInt(txtNumber2.getText());
            int sum = num1 + num2;
            lblAnswer.setText(String.valueOf(sum));

        });

        btnRest.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(txtNumber1.getText());
            int num2 = Integer.parseInt(txtNumber2.getText());
            int sum = num1 - num2;
            lblAnswer.setText(String.valueOf(sum));

        });

        btnMulti.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(txtNumber1.getText());
            int num2 = Integer.parseInt(txtNumber2.getText());
            int sum = num1 * num2;
            lblAnswer.setText(String.valueOf(sum));

        });

        btnDiv.setOnAction(actionEvent -> {
            int num1 = Integer.parseInt(txtNumber1.getText());
            int num2 = Integer.parseInt(txtNumber2.getText());
            int sum = num1 / num2;
            lblAnswer.setText(String.valueOf(sum));

        });




        root.getChildren().addAll(lblTitulo, lblNumber1, txtNumber1, lblNumber2, txtNumber2, lblAnswer);
        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("UAM");
        stage.setScene(scene);
        stage.show();

    }
}
