import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        ControllerManager manager = ControllerManager.getInstance();
        manager.setStage(primaryStage);

        FXMLLoader newLoader;

        newLoader = new FXMLLoader(getClass().getResource("FirstPage.fxml"));
        Parent page1 = newLoader.load();
        Controller controller1 = (Controller)newLoader.getController();

        newLoader = new FXMLLoader(getClass().getResource("SecondPage.fxml"));
        Parent page2 = newLoader.load();
        Controller controller2 = newLoader.getController();

        controller1.setManager(manager);
        controller2.setManager(manager);

        scene1 = new Scene(page1, 656,276);
        scene2 = new Scene(page2, 656,276);
        manager.add(SceneName.MAIN, scene1, controller1);
        manager.add(SceneName.SECOND, scene2, controller2);


        //window.setScene(scene1);
        manager.setScene(SceneName.MAIN);
        window.setTitle("RADadmin");
        window.show();
    }
}
