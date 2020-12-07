package afpa.moi.org.Tool;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.MalformedURLException;

public class SceneManager {
    public void ChangeScene(ActionEvent e, String fileName) throws MalformedURLException {
        Parent root = null;
        try {
            root = FXMLLoader.load(this.getClass().getResource("../GUI/" + fileName + ".fxml"));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        Scene scene = new Scene(root);
        Stage window = (Stage) ((Node)e.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
}
