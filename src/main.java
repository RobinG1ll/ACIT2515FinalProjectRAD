import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    Stage window;
    Scene scene1;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Parent page1 = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
        scene1 = new Scene(page1, 656,276);

        window.setScene(scene1);
        window.setTitle("RADadmin");
        window.show();
    }
}
