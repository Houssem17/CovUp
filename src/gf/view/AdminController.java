/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import gf.animations.FadeInLeftTransition;
import gf.animations.FadeInRightTransition;
import gf.animations.FadeInUpTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Houssem
 */
public class AdminController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
              @FXML
    private JFXButton gagences;

   
   
    
    @FXML
    private JFXButton goffres;

    @FXML
    private ImageView iprofil;

    @FXML
    private JFXButton stat;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXButton mprofil;

    @FXML
    private JFXButton ajout;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private GridPane gridpane;

    @FXML
    private JFXButton guser;

    @FXML
    private JFXButton gblog;

    @FXML
    private JFXButton btnupload;

    @FXML
    private JFXButton gmvoi;

    @FXML
    private JFXButton boite;

    @FXML
    private JFXButton gshout;

    @FXML
    private JFXButton gevent;
    
     @FXML
    private AnchorPane root;

    public static AnchorPane rootP;
    
    @FXML
    void btnguser(ActionEvent event) {
        
        
        
          try {
                System.out.println("pageadmin");
                Parent admin_parent=FXMLLoader.load(getClass().getResource("Guser.fxml"));
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
    void btnupload(ActionEvent event) {

    }

    

    @FXML
    void btnmprofil(ActionEvent event) {

    }

    @FXML
    void btnajout(ActionEvent event) {

    }

    
    @FXML
    void btngoffres(ActionEvent event) {

    }

    @FXML
    void btngagences(ActionEvent event) {

    }

    @FXML
    void btngmvoi(ActionEvent event) {

    }

    @FXML
    void btngshout(ActionEvent event) {

    }

    @FXML
    void btngevent(ActionEvent event) {

    }

    @FXML
    void btngblog(ActionEvent event) {

    }

    @FXML
    void btnboite(ActionEvent event) {

    }

    @FXML
    void btnstat(ActionEvent event) {

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        rootP = root;
        
        
            new FadeInUpTransition(guser).play();
          new FadeInUpTransition(goffres).play();
            new FadeInUpTransition(gshout).play();
            new FadeInUpTransition(gagences).play();
            new FadeInUpTransition(gevent).play();
             new FadeInUpTransition(boite).play();
              new FadeInUpTransition(stat).play();
              new FadeInUpTransition(gblog).play();
              new FadeInUpTransition(gmvoi).play();
              
              
              
                
        
        try {
            VBox box = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            drawer.setSidePane(box);
        } catch (IOException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
             
            
       
        
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
        // TODO
    }    
    
}
