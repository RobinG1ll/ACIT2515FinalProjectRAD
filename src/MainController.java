import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class MainController extends Controller{

    @FXML
    private Button doneBut;

    @FXML
    private TextField fileLoc;

    @FXML
    private Button selectBut;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void doneBut(){
        PcapSplitter newFile = new PcapSplitter();
        newFile.PcapSplit(newFile.readFile(fileLoc.getText()));
        newFile.MasterList();

        ObservableList<TableContent> tableContents = FXCollections.observableArrayList(newFile.getInfo());
        manager.getController(SceneName.SECOND).setData(tableContents);
        this.changeScene(SceneName.SECOND);

    }

    @FXML
    public void selectBut() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PCAP Files", "*.pcap"));
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(new Stage());
        fileLoc.setText(file.getAbsolutePath());
    }

}
