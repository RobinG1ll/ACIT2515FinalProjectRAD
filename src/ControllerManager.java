import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class ControllerManager {

    private static ControllerManager instance = new ControllerManager();

    private ControllerManager(){}

    public static ControllerManager getInstance() {
        return instance;
    }
    private Stage stage;
    private HashMap<SceneName, Scene> scenes = new HashMap<>();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void add(SceneName name, Scene scene, Controller controller) {
        scenes.put(name, scene);
        controllers.put(name, controller);
    }

    public void setScene(SceneName name) {
        stage.setScene(scenes.get(name));
    }

    private HashMap<SceneName, Controller> controllers = new HashMap<>();

    public Controller getController(SceneName name){
        return controllers.get(name);
    }
}
