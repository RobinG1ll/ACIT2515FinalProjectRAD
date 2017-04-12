import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

/**
 * Created by Robin on 11-Apr-17.
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
