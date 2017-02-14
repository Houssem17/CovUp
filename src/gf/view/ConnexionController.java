
package gf.view;

import gf.utils.ConnexionSingleton;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
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
    void btnconnexion(ActionEvent event) throws IOException {
        
        /*
        String login = fUser.getText();
        String mdp = fPwd.getText();
        Membre m = new Membre();
        String pswd="";
        try {
            String req = "SELECT * FROM membre WHERE `pseudo`='" + login+"'";
            PreparedStatement stm = DataSource.getInstance().getConnection().prepareStatement(req);
            ResultSet rs = stm.executeQuery(req);
            if (rs.next() == true) {
                

                //String lo = rs.getString("pseudo");
                //String salt = rs.getString("salt");
               // pswd=m.get_SHA_512_SecurePassword(mdp, salt);
            }
        } catch (SQLException ex) {

        }
        try {
            System.out.println(login + pswd);
            String req = "SELECT * FROM membre WHERE `pseudo`='" + login + "' AND `mdp`='" + mdp + "'";
            PreparedStatement stm = ConnexionSingleton.getInstance().prepareStatement(req);
            ResultSet rs = stm.executeQuery(req);

            if (rs.next() == true) {

                int id = rs.getInt("id");

                String lo = rs.getString("pseudo");
                String nom = rs.getString("nom");
                
                String prenom = rs.getString("prenom");
                String email = rs.getString("email");
                String tel = rs.getString("tel");
                String image = rs.getString("image");
                float solde = rs.getFloat("solde");
                String md = rs.getString("mdp");
                String role = rs.getString("role");

                if ((lo != "") && (md != "")) {
                    if (role.equals("ADMIN")) {
                        Membre membre = new Membre(id, lo, nom, prenom, email, tel, solde, image, md);
                         this.dispose();
                        CrowdRiseAdmin c=new CrowdRiseAdmin(membre);
                        

                    } else {
                        //Membre membre = new Membre(id, lo, nom, prenom, email, tel, s, image, md);
                        Membre membre = new Membre(id, lo, nom, prenom, email, tel, solde, image, md);
                        this.dispose();
                        CrowdRise h = new CrowdRise(membre);
                    }

                }
            } else {
               
            }
        } catch (SQLException ex) {

        }*/
        
         try {
                System.out.println("pageadmin");
                Parent admin_parent=FXMLLoader.load(getClass().getResource("Admin.fxml"));
                Scene admin_scene=new Scene(admin_parent);
                Stage admin_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                admin_stage.setScene(admin_scene);
                admin_stage.show();
            } catch (IOException ex) {
                Logger.getLogger(ConnexionController.class.getName()).log(Level.SEVERE, null, ex);
            }


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
