
package gf.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
//import com.restfb.DefaultFacebookClient;
//import com.restfb.FacebookClient;
//import com.restfb.types.User;
import gf.animations.FadeInLeftTransition;
import gf.animations.FadeInRightTransition;
import gf.animations.FadeInUpTransition;
import gf.dao.classes.UtilisateurDAO;
import gf.entity.Utilisateur;
import gf.utils.ConnexionSingleton;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;


/**
 * FXML Controller class
 *
 * @author Houssem
 */
public class ConnexionController implements Initializable {
    private AnchorPane rootLayout;
    private Stage primaryStage;
    
   

    @FXML
    private ImageView bg;

    @FXML
    private JFXButton insc;

    @FXML
    private JFXPasswordField mdp;

    @FXML
    private JFXTextField login;

    @FXML
    private JFXButton cnx;

    @FXML
    private JFXButton fb;

    @FXML
    private ImageView logo;

    
 

  

    @FXML
    private ImageView ifb;

    @FXML
    void btnconnexion(ActionEvent event) throws SQLException, IOException{
     
           String lo = login.getText();
             String psw = mdp.getText();
             Utilisateur u = new Utilisateur();
            
            
            String req = "SELECT * FROM utilisateur WHERE `username`='" + lo  + 
                    "' OR `e_mail`='" +lo+
                    "' AND `password`='" + psw + "'";
            PreparedStatement stm;
        try {
            stm = ConnexionSingleton.getInstance().getCnx().prepareStatement(req);
            ResultSet rs = stm.executeQuery(req);  
            if (rs.next() == true) {
                
                
               
               int id =rs.getInt("id");
               String mail =rs.getString("e_mail");
               String nom =rs.getString("nom");
               String prenom =rs.getString("prenom");
              // char genre =rs.getString("genre");
              String pseudo =rs.getString("username");
              String password =rs.getString("password");
              int cin =rs.getInt("cin");
              int tel =rs.getInt("tel");
              boolean est_admin =rs.getBoolean("est_admin");
             // LocalDate date_naissance=rs.getString
               
             if (est_admin)
             {    
                System.out.println("pageadmin");
                Parent admin_parent=FXMLLoader.load(getClass().getResource("Admin.fxml"));
                Scene admin_scene=new Scene(admin_parent);
                Stage admin_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                admin_stage.setScene(admin_scene);
                admin_stage.show();
             }
             else {
                 
                 
                 System.out.println("pageuser");
                Parent admin_parent=FXMLLoader.load(getClass().getResource("User.fxml"));
                Scene admin_scene=new Scene(admin_parent);
                Stage admin_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                admin_stage.setScene(admin_scene);
                admin_stage.show();
                 
                 
                 
             }
            
           }
            
            else {
            dialog(Alert.AlertType.ERROR, "Vérifiez votre identifiant(Pseudo/EMAIL) et/ou votre mot de passe");
            } 
            
        } 
            catch (SQLException ex) {
                
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
    void btnfb(ActionEvent event) throws IOException {/*
        
        String appId ="240404753085818";
        
        String accessToken ="EAACEdEose0cBAFppIz4Gus1i1UdSSZBcSYZCHWZALZBPNQf6RgsIn5QY1RRcxxLZC77HoD5ZCvTtumzsSBE3ItUOnT0CdHbUsa0OXvzAU5ZA2j8YUq7I95vK8eexAeHFFzA1nHsAvB6rt7fFDP20IZCUR8jYvYgOzS6cpIDSUitM5CxTljCrxeRh";
        FacebookClient fbClient = new DefaultFacebookClient (accessToken) ;
        User me = fbClient.fetchObject("me",User.class);
        System.out.println(me.getEmail());
        System.out.println(me.getFirstName());
        System.out.println(me.getLastName());
        System.out.println(me.getBirthday());
        System.out.println(me.getGender());
        System.out.println(me.getUsername());
        //fmail=me.getEmail()*/
        
        
        /*
         Parent inscription_parent=FXMLLoader.load(getClass().getResource("Inscription.fxml"));
                Scene inscription_scene=new Scene(inscription_parent);
                Stage inscription_stage=(Stage) ((Node) event.getSource())
                        .getScene()
                        .getWindow();
                inscription_stage.setScene(inscription_scene);
                inscription_stage.show();*/
           /*  String appId ="240404753085818";
             String domain ="http://www.google.com/";
               String authUrl = "https://graph.facebook.com/oauth/authorize?type=user_agent&client_id="+appId+"&redirect_uri="+domain+"&scope=user_about_me,"
                + "user_actions.books,user_actions.fitness,user_actions.music,user_actions.news,user_actions.video,user_activities,user_birthday,user_education_history,"
                + "user_events,user_photos,user_friends,user_games_activity,user_groups,user_hometown,user_interests,user_likes,user_location,user_photos,user_relationship_details,"
                + "user_relationships,user_religion_politics,user_status,user_tagged_places,user_videos,user_website,user_work_history,ads_management,ads_read,email,"
                + "manage_notifications,manage_pages,publish_actions,read_friendlists,read_insights,read_mailbox,read_page_mailboxes,read_stream,rsvp_event";
       
        System.setProperty("webdirver.chrome.driver", "C:\\chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
        driver.get(authUrl);
        String accessToken;
        while(true){
       
            if(!driver.getCurrentUrl().contains("facebook.com")){
            String url = driver.getCurrentUrl();
            accessToken = url.replaceAll(".*#access_token=(.+)&.*", "$1");
           
            driver.quit();
           
                FacebookClient fbClient = new DefaultFacebookClient(accessToken);
                User user = fbClient.fetchObject("me",User.class);
               
                System.out.println(user.getName());
           
            }
       
        }
       */
     
                
    }
    public static void dialog(Alert.AlertType alertType,String s){
        Alert alert = new Alert(alertType,s);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("ERREUR DE CONNEXION !");
        alert.showAndWait();
    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
         
        // TODO
        Platform.runLater(() -> {
            new FadeInLeftTransition(bg).play();
           new FadeInUpTransition(logo).play();
            new FadeInRightTransition(login).play();
            new FadeInRightTransition(mdp).play();
             new FadeInRightTransition(ifb).play();
             
            
        });
        
        
    }    
    
}
