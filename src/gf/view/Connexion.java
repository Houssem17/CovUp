
package gf.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Houssem
 */
public class Connexion extends Application {
    
    private Stage primaryStage;
    private Parent parentPage;
   @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        parentPage = FXMLLoader.load(getClass().getResource("Connexion.fxml"));
        Scene scene = new Scene(parentPage);
        this.primaryStage.setScene(scene);
        this.primaryStage.show();

    }
   
    public static void main(String[] args) {
        launch(args);
    }
    
}
