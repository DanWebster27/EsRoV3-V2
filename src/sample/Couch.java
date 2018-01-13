package sample;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Couch {

    public void backButton(javafx.event.ActionEvent event) throws IOException {

        Parent couchScene = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene back = new Scene(couchScene);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(back);
        window.show();
    }

    public void untersucheZ(javafx.event.ActionEvent event) throws IOException {

        Stage window = new Stage();
        window.setMinWidth(1000);
        javafx.scene.control.Label label = new Label();
        label.setText("Hallo");
        VBox layout = new VBox(20);
        layout.getChildren().addAll(label);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene (layout);
        window.setScene(scene);
        window.showAndWait();

    }


}