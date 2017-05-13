 RADAmin Created by: Abraham Al Jundi
		    Daniel Kole
		    Robin Gill
______________________________________________________________________________________________

1) Open the project (folder containin the src, maxmind ,etc)
2) Select Setup SDK and choose an sdk similar to 1.8.0_121 
	2a) If select not shown, enter project structure and choose the sdk there

This should make it work, if not make sure the following dependencies are there:

IF jnet missing
1) Choose to add new dependency - Jar
2) Enter project folder then jnetpcap-1.3.0
3) select jnetpcap.jar

IF maxmind missing

1) Choose to add new dependency - Jar
2) Enter project folder then maxmind_geoip_geoip-api_1.2.14
3) select geoip-api-1.2.14.jar

_______________________________________________________________________________________________

RADAmin features:

Accepts typed location path, or uses file browser (file browser only accepts pcap files)
Parses pcap file into source ip, destination ip and tot pkts
Selecting an ipv4 row, will display geographic information
Looks fancy
