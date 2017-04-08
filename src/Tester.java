import org.jnetpcap.packet.PcapPacket;
import org.jnetpcap.protocol.network.Ip4;

/**
 * Created by Daniel on 2017-04-06.
 */
public class Tester {

    final static PcapFile pcap = new PcapFile("tests/test.pcap");

    public static void main(String[] args) throws ExceptionReadingPcapFiles {

        pcap.readOfflineFiles();

    }

    public void nextPacket(PcapPacket packet, String user) {
        byte[] data = packet.getByteArray(0, packet.size());

        byte[] sIP = new byte[4];
        byte[] dIP = new byte[4];

        Ip4 ip = new Ip4();
        if (packet.hasHeader(ip) == false) {
            return; // Not IP packet
        }

        ip.source(sIP);
        ip.destination(dIP);


        String sourceIP = org.jnetpcap.packet.format.FormatUtils.ip(sIP);
        String destinationIP = org.jnetpcap.packet.format.FormatUtils.ip(dIP);

    }
}
