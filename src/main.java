import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main extends Application {

    Stage window;
    Scene scene1;

    public static void main(String[] args) {
        launch(args);

        PcapSplitter newone = new PcapSplitter();
        newone.PcapSplit(newone.readFile("C:\\Users\\Robin\\Desktop\\Class work\\Term 2\\ACIT - 2515 - Software Design\\FinalProject\\tests\\test.pcap"));
        newone.MasterList();
        System.out.println(newone.Master);
        System.out.println(newone.HitCounts);
        System.out.println(newone.SourceIP);
        System.out.println(newone.DestinationIP);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;

        Parent page1 = FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
        scene1 = new Scene(page1, 656,276);

        window.setScene(scene1);
        window.setTitle("RADadmin");
        window.show();
    }
}
