
package miniproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MiniProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         signup obj = new signup();
      obj.setVisible(true);
}
    
    public static void main(String[] args) {
        launch(args);
      
    }
    
}
