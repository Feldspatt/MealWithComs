package org.mealwith.GUI.Comment;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.mealwith.DAO.CommentsDAO;
import org.mealwith.Entities.Comment;
import org.mealwith.Tool.DataHolder;
import org.mealwith.Tool.SceneManager;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailController implements Initializable {

    private Comment comment;
    public TextField idField;
    public TextField userIDField;
    public TextField recipeIDField;
    public TextField ingredientIDField;
    public TextField creationDateField;
    public TextField contentField;

    public void initialize(URL url, ResourceBundle resourceBundle){
        comment = (Comment) DataHolder.getINSTANCE().getList().get(0);

        System.out.print("IngredientID: " + comment.getIngredientId());
        idField.setText(String.valueOf(comment.getId()));
        userIDField.setText(String.valueOf(comment.getUserId()));
        recipeIDField.setText(String.valueOf(comment.getRecipeId()));
        ingredientIDField.setText(String.valueOf(comment.getIngredientId()));
        creationDateField.setText(String.valueOf(comment.getCreationDate()));
        contentField.setText(String.valueOf(comment.getContent()));

    }

    public void Back(){
        SceneManager sm = new SceneManager();

        Stage stage = (Stage) idField.getScene().getWindow();
        sm.ChangeScene(stage, "list");
    }

    public void Delete(ActionEvent actionEvent) {
        CommentsDAO.Delete(comment.getId());
        Back();
    }
}
