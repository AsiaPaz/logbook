package sailing.logbook.dal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Position {
    @Column(name="latitudeDegrees")
    private int latitudeDegrees;
    @Column(name="latitudeMinutes")
    private int latitudeMinutes;
    @Column(name="latitudeDirection")
    private char latitudeDirection;
    @Column(name="longitudeDegrees")
    private int longitudeDegrees;
    @Column(name="longitudeMinutes")
    private int longitudeMinutes;
    @Column(name="longitudeDirection")
    private char longitudeDirection;

    public Position() {
    }

    public Position(int latitudeDegrees, int latitudeMinutes, char latitudeDirection, int longitudeDegrees, int longitudeMinutes, char longitudeDirection) {
        this.latitudeDegrees = latitudeDegrees;
        this.latitudeMinutes = latitudeMinutes;
        this.latitudeDirection = latitudeDirection;
        this.longitudeDegrees = longitudeDegrees;
        this.longitudeMinutes = longitudeMinutes;
        this.longitudeDirection = longitudeDirection;
    }

    public int getLatitudeDegrees() {
        return latitudeDegrees;
    }

    public void setLatitudeDegrees(int latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }

    public int getLatitudeMinutes() {
        return latitudeMinutes;
    }

    public void setLatitudeMinutes(int latitudeMinutes) {
        this.latitudeMinutes = latitudeMinutes;
    }

    public int getLongitudeDegrees() {
        return longitudeDegrees;
    }

    public void setLongitudeDegrees(int longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }

    public int getLongitudeMinutes() {
        return longitudeMinutes;
    }

    public void setLongitudeMinutes(int longitudeMinutes) {
        this.longitudeMinutes = longitudeMinutes;
    }

    public char getLatitudeDirection() {
        return latitudeDirection;
    }

    public void setLatitudeDirection(char latitudeDirection) {
        this.latitudeDirection = latitudeDirection;
    }

    public char getLongitudeDirection() {
        return longitudeDirection;
    }

    public void setLongitudeDirection(char longitudeDirection) {
        this.longitudeDirection = longitudeDirection;
    }
}
