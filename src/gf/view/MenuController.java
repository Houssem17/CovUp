package gf.view;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import gf.view.AdminController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class MenuController implements Initializable {
  @FXML
    private JFXButton b2;

    @FXML
    private JFXButton b3;

    @FXML
    private JFXButton exit;

    @FXML
    private ImageView back;

    @FXML
    private JFXButton b1;

    @FXML
    void changeimage(ActionEvent event) {

    }

    

    @FXML
    void mcompte(ActionEvent event) {

    }

    

    @FXML
    void ajoutadmin(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) {
        
            try {
                System.out.println("retourconnexion");
                Parent Connexion_parent=FXMLLoader.load(getClass().getResource("Connexion.fxml"));
                Scene Connexion_scene=new Scene(Connexion_parent);
                Stage Connexion_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                Connexion_stage.setScene(Connexion_scene);
                Connexion_stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ConnexionController.class.getName()).log(Level.SEVERE, null, ex);
            }
          

    }

   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
/*
    @FXML
    private void changeColor(ActionEvent event) {
        JFXButton btn = (JFXButton) event.getSource();
        System.out.println(btn.getText());
        switch(btn.getText())
        {
            case "Color 1":AdminController.rootP.setStyle("-fx-background-color:#00FF00");
                break;
            case "Color 2":AdminController.rootP.setStyle("-fx-background-color:#0000FF");
                break;
            case "Color 3":AdminController.rootP.setStyle("-fx-background-color:#FF0000");
                break;
        }
    }
*/
   
}
