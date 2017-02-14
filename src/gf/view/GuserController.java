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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

public class GuserController implements Initializable {

    @FXML
    private FlowPane main;
    @FXML
    private JFXTreeTableView<User> treeView;
    
    @FXML
    private JFXButton mod;
    
    @FXML
    private JFXButton retour;

   @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXTextField Id;

    @FXML
    private JFXHamburger hamburger;

    @FXML
    private JFXButton sup;

    

    @FXML
    void btnmod(ActionEvent event) {

    }

    

    @FXML
    void btnsup(ActionEvent event) {

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

    
    
    @FXML
    void ed0000(ActionEvent event) {

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
        
        
        JFXTreeTableColumn<User, String> deptName = new JFXTreeTableColumn<>("ID");
        deptName.setPrefWidth(150);
        deptName.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<User, String> param) {
                return param.getValue().getValue().department;
            }
        });

        JFXTreeTableColumn<User, String> ageCol = new JFXTreeTableColumn<>("Nom");
        ageCol.setPrefWidth(150);
        ageCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<User, String> param) {
                return param.getValue().getValue().age;
            }
        });

        JFXTreeTableColumn<User, String> nameCol = new JFXTreeTableColumn<>("Prenom");
        nameCol.setPrefWidth(150);
        nameCol.setCellValueFactory(new Callback<TreeTableColumn.CellDataFeatures<User, String>, ObservableValue<String>>() {
            @Override
            public ObservableValue<String> call(TreeTableColumn.CellDataFeatures<User, String> param) {
                return param.getValue().getValue().userName;
            }
        });
        
     

        ObservableList<User> users = FXCollections.observableArrayList();
        users.add(new User("1", "houssem", "fsdg"));
        users.add(new User("2", "sqf", "dfh"));
        users.add(new User("3", "xxx", "qgddsg"));
     

        final TreeItem<User> root = new RecursiveTreeItem<User>(users, RecursiveTreeObject::getChildren);
        treeView.getColumns().setAll(deptName, ageCol, nameCol);
        treeView.setRoot(root);
        treeView.setShowRoot(false);

    }

    @FXML
    private void filter(ActionEvent event) {
    }

    class User extends RecursiveTreeObject<User> {

        StringProperty userName;
        StringProperty age;
        StringProperty department;

        public User(String department, String age, String userName) {
            this.department = new SimpleStringProperty(department);
            this.userName = new SimpleStringProperty(userName);
            this.age = new SimpleStringProperty(age);
        }

    }
    
   
    
    
}
