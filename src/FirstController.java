import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class FirstController implements Initializable{

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


    @FXML private TableView<IPHandler> tableView;
    @FXML private TableColumn<IPHandler, String> UserId;
    @FXML private TableColumn<IPHandler, String> UserName;
    @FXML private TableColumn<IPHandler, String> Active;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        UserId.setCellValueFactory(new PropertyValueFactory<IPHandler, String>("id"));
        UserName.setCellValueFactory(new PropertyValueFactory<IPHandler, String>("name"));
        Active.setCellValueFactory(new PropertyValueFactory<IPHandler, String>("active"));

        tableView.getItems().setAll(parseUserList());
    }
    private List<IPHandler> parseUserList(){
        // parse and construct User datamodel list by looping your ResultSet rs
        // and return the list
        return null;
    }


    public void Go2Press(ActionEvent event){
        System.out.println(fileLoc.getText());
    }

}