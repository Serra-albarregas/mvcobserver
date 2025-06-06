package com.serra;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * La clase <code>App</code> es la aplicación principal que extiende la clase <code>Application</code> de JavaFX.
 * Esta clase es responsable de iniciar la aplicación, configurar la ventana principal (Stage), 
 * establecer el icono de la ventana, y gestionar las escenas mediante el <code>SceneManager</code>.
 */
public class App extends Application {

    /**
     * Método que se ejecuta cuando la aplicación JavaFX inicia.
     * 
     * Este método configura el título de la ventana, establece el icono de la ventana,
     * inicializa el <code>SceneManager</code>, configura las escenas disponibles y carga la escena principal.
     * 
     * @param stage el <code>Stage</code> principal de la aplicación, que representa la ventana.
     * @throws IOException si ocurre un error al cargar los recursos o las vistas.
     */
    @SuppressWarnings("exports")
    @Override
    public void start(Stage stage) throws IOException {
        // Establece el título de la ventana
        stage.setTitle("Estructura base de una aplicación en JAVAFX");
        
        // Establece el icono de la ventana
        stage.getIcons().add(new Image(App.class.getResource("images/icon.png").toExternalForm()));
        
        // Obtiene la instancia del SceneManager
        SceneManager sm = SceneManager.getInstance();
        
        // Inicializa el SceneManager con el stage y una ruta de estilos
        sm.init(stage, "styles");
        
        // Configura las escenas con identificadores y tamaños
        sm.setScene(SceneID.MAIN, "MainView");
        
        // Carga la escena principal
        sm.loadScene(SceneID.MAIN);
    }

    /**
     * El método principal que lanza la aplicación JavaFX.
     * 
     * @param args los argumentos de la línea de comandos, no utilizados en este caso.
     */
    public static void main(String[] args) {
        launch();
    }
}
