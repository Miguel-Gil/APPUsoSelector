package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_gilmiguel.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class APPUsoSelectorController implements Initializable {
    @FXML
    private VBox root;
    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label lbl;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ArrayList<String> cosas = new ArrayList();
        cosas.add("Cosa1");
        cosas.add("Cosa2");
        cosas.add("Cosa3");

        selector1.setItems(cosas);

        ArrayList <String> items = new ArrayList();
        items.add("Thing1");
        items.add("Thing2");
        items.add("Thing3");
        items.add("Thing4");

        selector2.setItems(items);
    }

    @FXML
    private void pulsadoArriba(ActionEvent event) {
        lbl.setText("Pulsado el selector de arriba");
    }

    @FXML
    private void pulsadoAbajo(ActionEvent event) {
        lbl.setText("Pulsado el selector de abajo");
    }
}
