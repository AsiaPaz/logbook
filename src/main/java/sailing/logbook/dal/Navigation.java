package sailing.logbook.dal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Navigation {
    @Column(name="log")
    private int log;
    @Column(name="COG")
    private int COG;
    @Column(name="speed")
    private float speed;

    public Navigation() {
    }

    public Navigation(int log, int COG, float speed) {
        this.log = log;
        this.COG = COG;
        this.speed = speed;
    }

    public int getLog() {
        return log;
    }

    public void setLog(int log) {
        this.log = log;
    }

    public int getCOG() {
        return COG;
    }

    public void setCOG(int COG) {
        this.COG = COG;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}
