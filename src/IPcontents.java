import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class IPcontents {

    private StringProperty ipadd = new SimpleStringProperty();
    private StringProperty country = new SimpleStringProperty();
    private StringProperty region = new SimpleStringProperty();
    private StringProperty city = new SimpleStringProperty();
    private StringProperty postal = new SimpleStringProperty();
    private StringProperty area = new SimpleStringProperty();
    private StringProperty latitude = new SimpleStringProperty();
    private StringProperty longitude = new SimpleStringProperty();

    public IPcontents(String ipadd, String count, String reg, String cit, String pos, String are, String lat, String lon){
        setIpadd(ipadd);
        setCountry(count);
        setRegion(reg);
        setCity(cit);
        setPostal(pos);
        setArea(are);
        setLatitude(lat);
        setLongitude(lon);
    }

    public String getIpadd() {
        return ipadd.get();
    }

    public StringProperty ipaddProperty() {
        return ipadd;
    }

    public void setIpadd(String ipadd) {
        this.ipadd.set(ipadd);
    }

    public String getCountry() {
        return country.get();
    }

    public StringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getRegion() {
        return region.get();
    }

    public StringProperty regionProperty() {
        return region;
    }

    public void setRegion(String region) {
        this.region.set(region);
    }

    public String getCity() {
        return city.get();
    }

    public StringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getPostal() {
        return postal.get();
    }

    public StringProperty postalProperty() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal.set(postal);
    }

    public String getArea() {
        return area.get();
    }

    public StringProperty areaProperty() {
        return area;
    }

    public void setArea(String area) {
        this.area.set(area);
    }

    public String getLatitude() {
        return latitude.get();
    }

    public StringProperty latitudeProperty() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude.set(latitude);
    }

    public String getLongitude() {
        return longitude.get();
    }

    public StringProperty longitudeProperty() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude.set(longitude);
    }
}
