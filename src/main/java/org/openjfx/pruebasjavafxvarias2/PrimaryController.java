package org.openjfx.pruebasjavafxvarias2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrimaryController implements Initializable {
    
    private Usuario usuario;

    @FXML
    private TextField tfNombre, tfApellido, tfCiudad;
    
    @FXML
    private void enviarDatos(MouseEvent event) {
        String nombre = tfNombre.getText().trim();
        String apellido = tfApellido.getText().trim();
        String ciudad = tfCiudad.getText().trim();
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setCiudad(ciudad);
    }
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
