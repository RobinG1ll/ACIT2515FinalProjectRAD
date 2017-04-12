import java.util.ArrayList;


/**
 * Created by Daniel on 4/7/2017.
 */
public class PcapSplitter extends PcapConvert{

    ArrayList<String> IPs = new ArrayList<>();
    ArrayList<Integer> TotPkts = new ArrayList<>();
    ArrayList<String> SourceIP = new ArrayList<>();
    ArrayList<String> DestinationIP = new ArrayList<>();
    ArrayList<String> Master = new ArrayList<>();


    public void PcapSplit(String string){
        String[] input = string.split(",");
        for(String entry : input){
            IPs.add(entry);
        }
    }

    public void RetrieveInfo(){
        int i = 0;
        for(String entry : IPs) {
            String[] info = entry.split(" ", 5);
            if(i == 0) {
                SourceIP.add(info[0].substring(1));
                DestinationIP.add(info[2]);
                i++;
            } else {
                SourceIP.add(info[1]);
                DestinationIP.add(info[3]);
            }
        }
    }

    public void RetrievePkts() {
        for (String entry : IPs) {
            String[] pkts = entry.split("]");
            TotPkts.add(lastInteger(pkts[0]));
        }
    }

    public void MasterList(){
        RetrievePkts();
        RetrieveInfo();
        for(int i = 0; i < TotPkts.size(); i++){
            Master.add(SourceIP.get(i));
            Master.add(DestinationIP.get(i));
            Master.add(TotPkts.get(i).toString());
        }
    }

    public void clearAll(){
        Master.clear();
        SourceIP.clear();
        DestinationIP.clear();
        IPs.clear();
    }

    public Integer lastInteger(String s) {
        int i = s.length();
        while (i > 0 && Character.isDigit(s.charAt(i - 1))) {
            i--;
        }
        return new Integer(s.substring(i));
    }
}
