package co.edu.uniquindio.universidadfx.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.universidadfx.controller.ConsultasController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ConsultasViewController {


    ConsultasController consultasController;


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnConsultarNotas;

    @FXML
    private Button btnConsultarPromedio;

    @FXML
    private TextField txtIdentificadorDocente;

    @FXML
    private TextField txtIdentificadorEstudiante;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onActionConsultarNotas(ActionEvent event) {
        consultarNotasPorEstudiante();
    }

    @FXML
    void onActionConsultarPromedio(ActionEvent event) {

    }

    @FXML
    void initialize() {
        consultasController = new ConsultasController();
    }


    private void consultarNotasPorEstudiante() {
        String cedulaDocente = txtIdentificadorDocente.getText();
        if(!cedulaDocente.equalsIgnoreCase("")){
            String resultado = consultasController.consultarNotasPorEstudiante(cedulaDocente);
            txtResultado.setText(resultado);
        }
    }
}

