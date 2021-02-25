package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    // aqui iria toda la logica de nuestro programa.

    //Para poder usar componentes de la escena debemos importarlo con el Clase NOMBRE_ID Button idBoton;
    @FXML
    Button idBoton;
    // puedo obtener y modificar un componente no importado de esta manera realizando el siguiente procedimiento
    /*
     * Button boton = (Button) idLayout.getScene().lookup("#IDELEMENTO")
     *
     * y se nos almacenaria en esa variable boton el boton que hayamos obtenido.
     * */

    @FXML
    public void initialize() {
        //esto es una funcion que se ejecuta al iniciar el programa - escena
    }

    public void onClickBoton(MouseEvent evento) {
        idBoton.setText("boton clickado"); // cambiamos el texto de dentro
        idBoton.getText(); // obtiene el texto
    }

    public void abrirNuevaVentana(MouseEvent event) {
        try {
            // de esta manera tambien podremos obtener el controller mediante loader.getController(); para ejecutar metodos que tenga dentro y pasar informacion.

            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("nombreArchivoFXML.fxml"));
            GridPane root = (GridPane) loader.load(); // aqui en vez de Hbox devemos poner el tipo de layout principal que tenga nuestra escena
            stage.show(); // muestra la escena.

        } catch (IOException e) {
            e.printStackTrace();
        }
        // todos las escenas - archivos fxml tienen que ir con su controller correspondiente.
    }
}
