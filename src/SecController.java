import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Robin on 11-Apr-17.
 */

public class SecController extends Controller{

    @FXML
    private Button back;

    @FXML
    private TableView<TableContent> newTable = new TableView<>();

    @FXML
    private TableColumn<TableContent, String> Source = new TableColumn<>();

    @FXML
    private TableColumn<TableContent, String> Dest = new TableColumn<>();

    @FXML
    private TableColumn<TableContent, Integer> Count = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Source.setCellValueFactory(cellData -> cellData.getValue().sourceProperty());
        Dest.setCellValueFactory(cellData -> cellData.getValue().destinationProperty());
        Count.setCellValueFactory(cellData -> cellData.getValue().hitcountProperty().asObject());
    }

    @FXML
    public void setData(ObservableList<TableContent> tableContents){
        newTable.setItems(tableContents);
    }
}
