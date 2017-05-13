import java.util.ArrayList;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class PcapSplitter extends PcapConvert{

    ArrayList<String> IPs = new ArrayList<>();
    ArrayList<Integer> HitCounts = new ArrayList<>();
    ArrayList<String> SourceIP = new ArrayList<>();
    ArrayList<String> DestinationIP = new ArrayList<>();
    ArrayList<TableContent> info = new ArrayList<>();

    public ArrayList<TableContent> getInfo() {
        return info;
    }


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

    public void RetrieveHits() {
        for (String entry : IPs) {
            String[] hitCount = entry.split("]");
            HitCounts.add(lastInteger(hitCount[0]));
        }
    }

    public void MasterList(){
        RetrieveHits();
        RetrieveInfo();
        for(int i = 0; i < HitCounts.size(); i++){
            info.add(new TableContent(SourceIP.get(i), DestinationIP.get(i), HitCounts.get(i)));
        }
    }

    public void clearAll(){
        info.clear();
        SourceIP.clear();
        DestinationIP.clear();
        IPs.clear();
        HitCounts.clear();
    }

    public Integer lastInteger(String s) {
        int i = s.length();
        while (i > 0 && Character.isDigit(s.charAt(i - 1))) {
            i--;
        }
        return new Integer(s.substring(i));
    }
}
