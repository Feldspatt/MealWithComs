package afpa.moi.org.DAO;

import afpa.moi.org.Entities.Comments;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CommentsDAO {

    public List<Comments> list() {
        // méthode de création de liste
        List<Comments> resultat = new ArrayList<Comments>();

        try {

            String url = "jdbc:mysql://localhost:3306/mealwith?serverTimezone=UTC";
            Connection con = DriverManager.getConnection(url, "root", "");

            Statement stm = con.createStatement();

            ResultSet result = stm.executeQuery("SELECT * FROM Comments");

            while (result.next()) {
                Comments c = new Comments();

                c.setId(result.getInt("id"));
                c.setIngredientId(result.getInt("id_ingredient_id"));
                c.setUserId(result.getInt("user_id"));
                c.setRecipeId(result.getInt("id_ingredient_id"));
                c.setContent(result.getString("content"));
                resultat.add(c);
            }

            stm.close();
            result.close();
            con.close();
        } catch (Exception e) {
            System.out.println("Erreur de lecture 'Comments'");
            System.out.println(e.getMessage());
        }

        return resultat;

    }
}
