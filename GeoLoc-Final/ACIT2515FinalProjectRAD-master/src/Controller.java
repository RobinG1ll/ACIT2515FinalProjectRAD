import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    private Button doneBut;

    @FXML
    private TextField fileLoc;

    @FXML
    private TableColumn Source;

    @FXML
    private TableColumn Dest;

    @FXML
    private TableColumn HCount;

    @FXML
    private Button selectBut;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }


    public void doneBut(){
        String fileLocation = fileLoc.getText();
        System.out.print(fileLocation);
    }

    @FXML
    public void selectBut() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PCAP Files", "*.pcap", "*.pcapng"));
        fileChooser.setTitle("Open Resource File");
        File file = fileChooser.showOpenDialog(new Stage());
        fileLoc.setText(file.getAbsolutePath());
    }
}