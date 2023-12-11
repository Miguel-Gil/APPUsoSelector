package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_gilmiguel.Main;
import es.ieslosmontecillos.componentes_gilmiguel.SelectorDeslizamiento;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
public class APPUsoSelector extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        //Creando la escena y seleccionando esta clase como el controlador
        //StackPane root = new StackPane();
        //SelectorDeslizamiento selc = new SelectorDeslizamiento();
        //root.getChildren().add(selc);
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("APPUsoSelectorView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();;
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
