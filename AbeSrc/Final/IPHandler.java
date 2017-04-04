package Final;

import javax.swing.table.TableColumn;
import java.util.ArrayList;

/**
 * Created by me on 2017-04-03.
 */
public class IPHandler {
    ArrayList<String> SourceIP = new ArrayList<>();
    ArrayList<String> DestinationIP = new ArrayList<>();
    ArrayList<String> HCount = new ArrayList<>();

    public void addSource(String source){
        SourceIP.add(source);
    }

    public void addDestination(String source){
        DestinationIP.add(source);
    }

    public void addHCount(String source){
        HCount.add(source);
    }

    public void SourcePopulate(TableColumn table){
        for(int i = 0; i < SourceIP.size(); i++){

        }
    }

    public void DestPopulate(TableColumn table){

    }

    public void HCountPopulate(TableColumn table){

    }
}
