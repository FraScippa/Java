package its.interfaccia_grafica.interfaccia;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Interfaccia extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creazione dei tre bottoni
        Button button1 = new Button("Bottone 1");
        Button button2 = new Button("Bottone 2");
        Button button3 = new Button("Bottone 3");

        // Impostiamo azioni sui bottoni
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hai premuto il Bottone 1");
            }
        });

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hai premuto il Bottone 2");
            }
        });

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hai premuto il Bottone 3");
            }
        });

        // Creiamo un layout (VBox) per posizionare i bottoni verticalmente
        VBox layout = new VBox(10); // 10 è lo spazio tra i bottoni
        layout.getChildren().addAll(button1, button2, button3);

        // Creiamo la scena e la impostiamo sullo stage
        Scene scene = new Scene(layout, 300, 200); // dimensioni della finestra
        primaryStage.setScene(scene);

        // Impostiamo il titolo della finestra
        primaryStage.setTitle("Interfaccia con 3 Bottoni");

        // Mostriamo la finestra
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

