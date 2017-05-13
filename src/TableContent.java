import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * ACIT 2515 Java Shark - Final Project - RADadmin
 *
 * @author Robin Gill - A00823034
 * @author Abraham Al Jundi - A00988199
 * @author Daniel Kole - A00994261
 */

public class TableContent {

    private StringProperty source = new SimpleStringProperty();
    private StringProperty destination = new SimpleStringProperty();
    private IntegerProperty hitcount = new SimpleIntegerProperty();

    public TableContent(String src, String des, Integer hits){
        setSource(src);
        setDestination(des);
        setHitcount(hits);
    }
    public String getSource() {
        return source.get();
    }

    public StringProperty sourceProperty() {
        return source;
    }

    public void setSource(String source) {
        this.source.set(source);
    }

    public String getDestination() {
        return destination.get();
    }

    public StringProperty destinationProperty() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination.set(destination);
    }

    public int getHitcount() {
        return hitcount.get();
    }

    public IntegerProperty hitcountProperty() {
        return hitcount;
    }

    public void setHitcount(int hitcount) {
        this.hitcount.set(hitcount);
    }
}
