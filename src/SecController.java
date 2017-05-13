import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class SecController extends Controller {

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

    @FXML
    private TableView<IPcontents> infoTable = new TableView<>();

    @FXML
    private TableColumn<IPcontents, String> country = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> region = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> city = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> postal = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> area = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> latit = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> longit = new TableColumn<>();

    @FXML
    private TableColumn<IPcontents, String> ipadd = new TableColumn<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Source.setCellValueFactory(cellData -> cellData.getValue().sourceProperty());
        Dest.setCellValueFactory(cellData -> cellData.getValue().destinationProperty());
        Count.setCellValueFactory(cellData -> cellData.getValue().hitcountProperty().asObject());

        ipadd.setCellValueFactory(cellData -> cellData.getValue().ipaddProperty());
        country.setCellValueFactory(cellData -> cellData.getValue().countryProperty());
        region.setCellValueFactory(cellData -> cellData.getValue().regionProperty());
        city.setCellValueFactory(cellData -> cellData.getValue().cityProperty());
        postal.setCellValueFactory(cellData -> cellData.getValue().postalProperty());
        area.setCellValueFactory(cellData -> cellData.getValue().areaProperty());
        latit.setCellValueFactory(cellData -> cellData.getValue().latitudeProperty());
        longit.setCellValueFactory(cellData -> cellData.getValue().longitudeProperty());

    }

    @FXML
    public void setData(ObservableList<TableContent> tableContents) {
        newTable.setItems(tableContents);
    }

    @FXML
    public void setIpData(ObservableList<IPcontents> iPcontents) {
        infoTable.setItems(iPcontents);
    }

    @FXML
    public void backBut() {
        PcapSplitter clear = new PcapSplitter();
        clear.clearAll();

        changeScene(SceneName.MAIN);
    }

    @FXML
    public void clickItem(MouseEvent event) {
        ObservableList<IPcontents> IPstuff = FXCollections.observableArrayList();

        if (event.getClickCount() == 1) {
            String SourceIpLocation = newTable.getSelectionModel().getSelectedItem().getSource();

            if (SourceIpLocation.contains(".")) {
                if (SourceIpLocation.contains(":")) {
                    SourceIpLocation = SourceIpLocation.substring(0, SourceIpLocation.indexOf(":"));
                }
                GeoLocation GeoInfoSource = GeoIPv4.getLocation(SourceIpLocation);
                if (!(GeoInfoSource == null)) {
                    IPstuff.add(new IPcontents(SourceIpLocation, GeoInfoSource.getCountryName(), GeoInfoSource.getRegion(),
                            GeoInfoSource.getCity(), GeoInfoSource.getPostalCode(), GeoInfoSource.getAreaCode() + "",
                            GeoInfoSource.getLatitude() + "", GeoInfoSource.getLongitude() + ""));
                }
            }

            String DestIpLocation = newTable.getSelectionModel().getSelectedItem().getDestination();
            if (DestIpLocation.contains(".")) {
                if (DestIpLocation.contains(":")) {
                    DestIpLocation = DestIpLocation.substring(0, DestIpLocation.indexOf(":"));
                }
                GeoLocation GeoInfoDest = GeoIPv4.getLocation(DestIpLocation);
                if (!(GeoInfoDest == null)) {
                    IPstuff.add(new IPcontents(DestIpLocation, GeoInfoDest.getCountryName(), GeoInfoDest.getRegion(),
                            GeoInfoDest.getCity(), GeoInfoDest.getPostalCode(), GeoInfoDest.getAreaCode() + "",
                            GeoInfoDest.getLatitude() + "", GeoInfoDest.getLongitude() + ""));
                }
            }
            infoTable.setItems(IPstuff);
        }
    }
}