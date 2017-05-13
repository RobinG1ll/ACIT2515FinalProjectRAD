import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public abstract class Controller implements Initializable {

    protected ControllerManager manager;

    public void setManager(ControllerManager manager) {
        this.manager = manager;
    }

    protected void changeScene(SceneName name) {
        manager.setScene(name);
    }

    public void setData(ObservableList<TableContent> tableContents){}

    public void setIpData(ObservableList<IPcontents> IPcontents){}
}