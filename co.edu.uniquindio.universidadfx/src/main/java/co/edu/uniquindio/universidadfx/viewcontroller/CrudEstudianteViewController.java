package co.edu.uniquindio.universidadfx.viewcontroller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.universidadfx.model.Estudiante;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class CrudEstudianteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnNuevo;

    @FXML
    private TableView<Estudiante> tableEstudiante;

    @FXML
    private TableColumn<Estudiante, String> tcAopellido;

    @FXML
    private TableColumn<Estudiante, String> tcEdad;

    @FXML
    private TableColumn<Estudiante, String> tcIdentificacion;

    @FXML
    private TableColumn<Estudiante, String> tcNombre;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtIdentificacion;

    @FXML
    private TextField txtNombre;

    @FXML
    void onActionActualizar(ActionEvent event) {

    }

    @FXML
    void onActionAgregar(ActionEvent event) {

        System.out.println("Evento del boton capturado");

    }

    @FXML
    void onActionNuevo(ActionEvent event) {

    }

    @FXML
    void initialize() {
    }

}
