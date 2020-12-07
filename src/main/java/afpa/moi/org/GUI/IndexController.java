package afpa.moi.org.GUI;
import afpa.moi.org.Tool.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.MalformedURLException;

public class IndexController {

    public Button userBtn;
    public TextField textFieldUser;
    public TextField textFieldRecipe;
    public Button recipeBtn;
    public TextField textFieldIngredient;
    public Button ingredientBtn;
    public IndexController thisController = this;

    public void GoToList(ActionEvent e) throws MalformedURLException {
        SceneManager sm = new SceneManager();
        sm.ChangeScene(e, "list");
    }
}
