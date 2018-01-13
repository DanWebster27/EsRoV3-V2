package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.awt.*;
import java.util.Stack;

public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Escape Room V3");
        window.setMinWidth(600);
        Label label = new Label();
        label.setText(message);

        Button yesButton = new Button("Ja");
        Button noButton = new Button("Nein");

        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });

        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });


        VBox layout = new VBox(20);
        layout.getChildren().addAll(label, yesButton, noButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene (layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;
    }

}
