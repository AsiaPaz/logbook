package sailing.logbook.dal;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class HourEntity {
    @Id
    @GeneratedValue
    private int id;
    private int timeLog;
    private LocalDate dateEntity;
    private String Watch;
    @Embedded
    private Position position;
    @Embedded
    private Navigation navigation;
    private String sails;
    private boolean engine;
    @Embedded
    private Meteo meteo;
    private String comments;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Cruise cruise;
    public HourEntity() {
    }


    public HourEntity(Cruise cruise, int timeLog, LocalDate dateEntity, String watch, Position position, Navigation navigation, String sails, boolean engine, Meteo meteo, String comments) {
        this.timeLog = timeLog;
        this.dateEntity = dateEntity;
        Watch = watch;
        this.position = position;
        this.navigation = navigation;
        this.sails = sails;
        this.engine = engine;
        this.meteo = meteo;
        this.comments = comments;
        this.cruise=cruise;
    }

    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
    }

    public int getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(int timeLog) {
        this.timeLog = timeLog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateEntity() {
        return dateEntity;
    }

    public void setDateEntity(LocalDate dateEntity) {
        this.dateEntity = dateEntity;
    }

    public String getWatch() {
        return Watch;
    }

    public void setWatch(String watch) {
        Watch = watch;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }

    public String getSails() {
        return sails;
    }

    public void setSails(String sails) {
        this.sails = sails;
    }

    public boolean getEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public Meteo getMeteo() {
        return meteo;
    }

    public void setMeteo(Meteo meteo) {
        this.meteo = meteo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HourEntity that = (HourEntity) o;
        return id == that.id &&
                timeLog == that.timeLog &&
                engine == that.engine &&
                Objects.equals(dateEntity, that.dateEntity) &&
                Objects.equals(Watch, that.Watch) &&
                Objects.equals(position, that.position) &&
                Objects.equals(navigation, that.navigation) &&
                Objects.equals(sails, that.sails) &&
                Objects.equals(meteo, that.meteo) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(cruise, that.cruise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timeLog, dateEntity, Watch, position, navigation, sails, engine, meteo, comments, cruise);
    }
}
