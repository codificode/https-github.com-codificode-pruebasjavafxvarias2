/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package org.openjfx.pruebasjavafxvarias2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author rubic
 */
public class DestinoController implements Initializable {
    
    private Usuario usuario;
    
    public void setUsuario (Usuario usuario){
        this.usuario = usuario;
    }
    
    @FXML
    private Label lblNombre, lblCiudad, lblApellido;
    
    @FXML
    private Button boton;
    
    public Button getBoton() {
        return boton;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
    }    
    
    @FXML
    public String recuperarDatos() {
        lblNombre.setText("Nombre: " + this.usuario.getNombre());
        lblCiudad.setText("Ciudad: " + this.usuario.getCiudad());
        lblApellido.setText("Apellido: " + this.usuario.getApellido());
        return "Hola";
    }    
}
