/**
 * Created by Daniel on 4/7/2017.
 */
public class PcapSplitter {

    public static void main (String[] args){

        PcapConvert newOne = new PcapConvert();
        System.out.println(newOne.readFile("wireshark.pcap"));
    }
}
