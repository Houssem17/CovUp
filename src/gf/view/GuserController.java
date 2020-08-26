package gf.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.FlowPane;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import gf.dao.classes.UtilisateurDAO;
import gf.entity.Shout;
import gf.entity.Utilisateur;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;
 import java.util.Properties;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
///import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;

public class GuserController implements Initializable {

  
    
    @FXML
    private JFXButton retour;

    @FXML
    private TableView<Utilisateur> tuser;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXButton bloquer;

    @FXML
    private FlowPane main;

    @FXML
    private TableColumn<Utilisateur, String> cpseudo;

    @FXML
    private TableColumn<Utilisateur, Number> ccin;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private TableColumn<Utilisateur, Number> cbloq;

    @FXML
    private TextField recherche;

    @FXML
    private JFXButton sup;

    @FXML
    private TableColumn<Utilisateur, LocalDate> cdate;

    @FXML
    private Label re;

    @FXML
    private JFXButton contacter;

    

    @FXML
    private TableColumn<Utilisateur, Number> ctel;

    @FXML
    private TableColumn<Utilisateur, String> cmail;

    @FXML
    private Pane affichageuser;
    
    private final ListData listdata = new ListData();

    @FXML
    void btnsup(ActionEvent event) {

    }

  

   

  

    @FXML
    void btnbloquer(ActionEvent event) {
             

    }



    @FXML
    void btncontact(ActionEvent event) {

    }




    
      @FXML
    void btnretour(ActionEvent event) {
        
         try {
                System.out.println("retourconnexion");
                Parent Connexion_parent=FXMLLoader.load(getClass().getResource("Admin.fxml"));
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

     private void settable(){
        
          tuser.setItems(listdata.getUsers());
        cmail.setCellValueFactory(cell -> cell.
                getValue().getE_mailProperty());
        cpseudo.setCellValueFactory(cell -> cell.
                getValue().getUsernameProperty());
        cbloq.setCellValueFactory(cell -> cell.
                getValue().getIdProperty());
        ctel.setCellValueFactory(cell -> cell.
                getValue().getTelProperty());
        ccin.setCellValueFactory(cell -> cell.
                getValue().getCinProperty());
        cdate.setCellValueFactory(cell -> cell.
                getValue().getDate_inscritProperty());
        }
 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
       
        settable();
        
         recherche.textProperty().addListener(new ChangeListener<String>()  {
            @Override
            public void changed(ObservableValue<? extends String> observable,
                                String oldValue, String newValue) {
                UtilisateurDAO udao = new UtilisateurDAO();
                List<Utilisateur> liste = null;
                try {
                    liste = udao.search(recherche.getText());
                    ObservableList<Utilisateur> data = FXCollections.observableArrayList(liste);
                   tuser.setItems(data);

                } catch (SQLException ex) {
                    Logger.getLogger(UtilisateurDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         
         settable();
  
        
       /* tuser.setOnMouseClicked(event->{
        idLabel.setText(String.valueOf(listdata.getUsers()
                .get(tuser.getSelectionModel().getSelectedIndex())
                .getId()));*/
        
        
        
        
        
         HamburgerBackArrowBasicTransition transition = new HamburgerBackArrowBasicTransition(hamburger);
        transition.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED,(e)->{
            transition.setRate(transition.getRate()*-1);
            transition.play();
            
            if(drawer.isShown())
            {
                drawer.close();
            }else
                drawer.open();
        });
        
        try {
            VBox box = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        
        
        
        
        
        

    }
    
   
    
    
}
