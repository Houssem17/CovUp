/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import gf.dao.classes.UtilisateurDAO;
import gf.entity.Utilisateur;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
import static javax.xml.bind.DatatypeConverter.parseInteger;

/**
 * FXML Controller class
 *
 * @author Houssem
 */
public class InscriptionController implements Initializable {


    /**
     * Initializes the controller class.
     */
       
      @FXML
    private JFXTextField mail;
    
    @FXML
    private JFXButton retour;

    @FXML
    private JFXButton btninsc;

    @FXML
    private JFXTextField Cin;

    @FXML
    private DatePicker date_de_naissance;

    @FXML
    private ImageView bg1;

    @FXML
    private JFXTextField nom;

    @FXML
    private JFXTextField mdp;

    @FXML
    private JFXTextField cmdp;

    @FXML
    private JFXTextField tel;

    @FXML
    private JFXRadioButton female;

    @FXML
    private JFXTextField pseudo;

    @FXML
    private JFXTextField prenom;

    @FXML
    private JFXRadioButton male;


    @FXML
    void btnretour(ActionEvent event) {
        
        
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

    @FXML
    void select_female(ActionEvent event) {

    }

    @FXML
    void select_male(ActionEvent event) {

    }

    @FXML
    void btninsc(ActionEvent event) {
        
        String Email = mail.getText();
        String Nom = nom.getText();
        String Prenom = prenom.getText();
         String Pseudo = pseudo.getText();
         
    char Genre ='X';
         
        if (male.isSelected())
        {   Genre = 'M';}
        else if (female.isSelected())
        { Genre ='F';}
        else 
        {
        
        }
        String Mdp = mdp.getText();
        int CIN = Integer.parseInt(Cin.getText());
        LocalDate localdate = date_de_naissance.getValue();
        LocalDate localdate1=LocalDate.now();
        int Tel = Integer.parseInt(tel.getText());
          
        
        Utilisateur u = new Utilisateur(0,Email,Nom,Prenom,Genre,Pseudo,Mdp,CIN,localdate,localdate1,Tel,false,false);
            UtilisateurDAO udao = UtilisateurDAO.getInstance();
            udao.ajouterUtilisateur(u);
            
           
   
      // Recipient's email ID needs to be mentioned.
      String to = Email;//change accordingly
/*
      // Sender's email ID needs to be mentioned
      String from = "houssembenaicha7@gmail.com";//change accordingly
      final String username = "houssembenaicha7@gmail.com";//change accordingly
      final String password = "hb@-brigate";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object./*
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
             protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("INSCRIPTION REUSSITE !");

         // Now set the actual message
         message.setText("Inscription Réussie ! Votre compte a été correctement créé.");

         // Send message
         Transport.send(message);

         System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }*/
   

   
            
            
         // int id, String nom, String prenom, char genre, String username, String password, int cin, LocalDate date_naissance, 
         // LocalDate date_inscrit, int tel, boolean est_bloque, boolean est_admin
    }
    
    
    

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
        // TODO
    }    
    
}
