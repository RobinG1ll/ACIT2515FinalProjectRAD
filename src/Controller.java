import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

public abstract class Controller implements Initializable {

    protected ControllerManager manager;

    public void setManager(ControllerManager manager) {
        this.manager = manager;
    }

    protected void changeScene(SceneName name) {
        manager.setScene(name);
    }

    public void setData(ObservableList<TableContent> tableContents){

    }
}