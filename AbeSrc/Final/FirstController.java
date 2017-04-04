package Final;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class FirstController {

    @FXML
    private Button Go2;

    @FXML
    private TextField fileLoc;

    @FXML
    private TableColumn Source;

    @FXML
    private TableColumn Dest;

    @FXML
    private TableColumn HCount;

    public void Go2Press(ActionEvent event){
        System.out.println(fileLoc.getText());
    }




}