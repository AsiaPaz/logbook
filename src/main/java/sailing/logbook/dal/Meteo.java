package sailing.logbook.dal;

import org.springframework.lang.Nullable;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Meteo {
    @Column(name="windDirection")
    private String windDirection;
    @Column(name=" windSpeedKnt")
    private float windSpeedKnt;
    @Column(name="windSpeedB")
    private int windSpeedB;
    @Column(name="seaState")
    private int seaState;
    @Column(name="visibility")
    private int visibility;
    @Column(name="temperature")
    private float temperature;
    @Column( name="cloudiness", nullable=true)
    private int cloudiness;
    @Column(name="phenomena")
    private String phenomena;
    @Column(name="pressure")
    private int pressure;
    public Meteo() {
    }

    public Meteo(String windDirection, float windSpeedKnt, int windSpeedB, int seaState, int visibility, float temperature, int cloudiness, String phenomena, int pressure) {
        this.windDirection = windDirection;
        this.windSpeedKnt = windSpeedKnt;
        this.windSpeedB = windSpeedB;
        this.seaState = seaState;
        this.visibility = visibility;
        this.temperature = temperature;
        this.cloudiness = cloudiness;
        this.phenomena = phenomena;
        this.pressure = pressure;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public float getWindSpeedKnt() {
        return windSpeedKnt;
    }

    public void setWindSpeedKnt(float windSpeedKnt) {
        this.windSpeedKnt = windSpeedKnt;
    }

    public int getWindSpeedB() {
        return windSpeedB;
    }

    public void setWindSpeedB(int windSpeedB) {
        this.windSpeedB = windSpeedB;
    }

    public int getSeaState() {
        return seaState;
    }

    public void setSeaState(int seaState) {
        this.seaState = seaState;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
        this.cloudiness = cloudiness;
    }

    public String getPhenomena() {
        return phenomena;
    }

    public void setPhenomena(String phenomena) {
        this.phenomena = phenomena;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
