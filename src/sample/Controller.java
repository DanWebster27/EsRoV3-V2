package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {




    public void closeButton(javafx.event.ActionEvent event) {

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        boolean answer = ConfirmBox.display("Title", "Sicher, dass Sie das Spiel verlassen wollen?");
        if (answer)
            window.close();

    }


    public void couchButton(javafx.event.ActionEvent event)  throws IOException {

        Parent couchScene = FXMLLoader.load(getClass().getResource("couch.fxml"));

        Scene couch = new Scene(couchScene);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(couch);
        window.show();

    }
}
