
package gf.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author Houssem
 */
public class ConnexionController implements Initializable {
    private AnchorPane rootLayout;
    private Stage primaryStage;
    
    @FXML
    private Button insc;

    @FXML
    private ImageView bg;

    @FXML
    private PasswordField mdp;

    @FXML
    private ImageView logo;

    @FXML
    private TextField login;

    @FXML
    private Button cnx;

    @FXML
    private ImageView fb;

    @FXML
    void btnconnexion(ActionEvent event) {

    }

    @FXML
    void btninscription(ActionEvent event) throws IOException {
        
             try {
                System.out.println("pageinscrip");
                Parent inscription_parent=FXMLLoader.load(getClass().getResource("Inscription.fxml"));
                Scene inscription_scene=new Scene(inscription_parent);
                Stage inscription_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                inscription_stage.setScene(inscription_scene);
                inscription_stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ConnexionController.class.getName()).log(Level.SEVERE, null, ex);
            }

    }

    @FXML
    void btnfb(ActionEvent event) {

    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        // TODO
        
        
    }    
    
}
