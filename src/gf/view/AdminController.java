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
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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
    private JFXButton guser;

    @FXML
    private JFXButton gagences;

    @FXML
    private JFXButton gblog;

    @FXML
    private AnchorPane anchorpane;

    @FXML
    private JFXButton goffres;

    @FXML
    private JFXButton stat;

    @FXML
    private JFXButton gmvoi;

    @FXML
    private JFXButton boite;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXButton gshout;

    @FXML
    private JFXButton gevent;

    @FXML
    private JFXHamburger hamburger;

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
