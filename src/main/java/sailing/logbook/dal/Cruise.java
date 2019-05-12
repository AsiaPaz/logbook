package sailing.logbook.dal;

import org.apache.tomcat.jni.Local;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Cruise {
    @Id
    @GeneratedValue
    private int id;
    private String route;
    private String yachtName;
    private LocalDate startDate;
    private LocalDate endDate;

    public Cruise(String route, String yachtName, LocalDate startDate, LocalDate endDate) {
        this.route = route;
        this.yachtName = yachtName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Cruise() {
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getYachtName() {
        return yachtName;
    }

    public void setYachtName(String yachtName) {
        this.yachtName = yachtName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
