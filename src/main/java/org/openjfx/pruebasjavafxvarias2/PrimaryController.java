package org.openjfx.pruebasjavafxvarias2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class PrimaryController implements Initializable {
    
    private Usuario usuario;

    @FXML
    private TextField tfNombre, tfApellido, tfCiudad;
    
    @FXML
    private void enviarDatos() {
        String nombre = tfNombre.getText().trim();
        String apellido = tfApellido.getText().trim();
        String ciudad = tfCiudad.getText().trim();
        Usuario u = new Usuario();
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setCiudad(ciudad);
        
        Node node = tfNombre;
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(PrimaryController.class.getResource("Destino.fxml"));
            
            DestinoController controller = new DestinoController();
            controller.setUsuario(u);
            fxmlLoader.setController(controller);
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            
            
            Button boton=controller.getBoton();
            
            boton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    controller.recuperarDatos();
                }
            });
            
            

            stage.setTitle("Tutorial javafx");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            System.err.println("Error creando ventana");
        }
    }
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
}
