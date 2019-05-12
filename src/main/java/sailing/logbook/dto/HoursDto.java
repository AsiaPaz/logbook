package sailing.logbook.dto;

import sailing.logbook.dal.Meteo;
import sailing.logbook.dal.Navigation;
import sailing.logbook.dal.Position;

import java.time.LocalDate;

public class HoursDto {
    private int timeLog;
    private LocalDate dateEntity;
    private String Watch;
    private Position position;
    private Navigation navigation;
    private String sails;
    private boolean engine;
    private Meteo meteo;
    private String comments;

    public HoursDto(int timeLog, LocalDate dateEntity, String watch, Position position, Navigation navigation, String sails, boolean engine, Meteo meteo, String comments) {
        this.timeLog = timeLog;
        this.dateEntity = dateEntity;
        Watch = watch;
        this.position = position;
        this.navigation = navigation;
        this.sails = sails;
        this.engine = engine;
        this.meteo = meteo;
        this.comments = comments;
    }

    public HoursDto() {
    }

    public int getTimeLog() {
        return timeLog;
    }

    public void setTimeLog(int timeLog) {
        this.timeLog = timeLog;
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
}
