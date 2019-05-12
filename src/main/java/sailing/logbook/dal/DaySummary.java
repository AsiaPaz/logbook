package sailing.logbook.dal;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class DaySummary {
    @Id
    @GeneratedValue
    private int id;
    private LocalDate dateEntity;
    @Embedded
    private Position startPosition;
  /*  @Embedded
    private Position endPosition;
    */
    private float dayLog;
    private float sailsTime;
    private float engineTime;
    private float strongWindHours;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Cruise cruise;

    public DaySummary() {
    }

    public DaySummary(Cruise cruise, LocalDate dateEntity, Position startPosition, float dayLog, float sailsTime, float engineTime, float strongWindHours) {
        this.dateEntity = dateEntity;
        this.startPosition = startPosition;
     //   this.endPosition = endPosition;
        this.dayLog = dayLog;
        this.sailsTime = sailsTime;
        this.engineTime = engineTime;
        this.strongWindHours = strongWindHours;
        this.cruise=cruise;
    }
    public Cruise getCruise() {
        return cruise;
    }

    public void setCruise(Cruise cruise) {
        this.cruise = cruise;
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

    public Position getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(Position startPosition) {
        this.startPosition = startPosition;
    }

/*    public Position getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }
*/
    public float getDayLog() {
        return dayLog;
    }

    public void setDayLog(float dayLog) {
        this.dayLog = dayLog;
    }

    public float getSailsTime() {
        return sailsTime;
    }

    public void setSailsTime(float sailsTime) {
        this.sailsTime = sailsTime;
    }

    public float getEngineTime() {
        return engineTime;
    }

    public void setEngineTime(float engineTime) {
        this.engineTime = engineTime;
    }

    public float getStrongWindHours() {
        return strongWindHours;
    }

    public void setStrongWindHours(float strongWindHours) {
        this.strongWindHours = strongWindHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySummary that = (DaySummary) o;
        return id == that.id &&
                Float.compare(that.dayLog, dayLog) == 0 &&
                Float.compare(that.sailsTime, sailsTime) == 0 &&
                Float.compare(that.engineTime, engineTime) == 0 &&
                Float.compare(that.strongWindHours, strongWindHours) == 0 &&
                Objects.equals(dateEntity, that.dateEntity) &&
                Objects.equals(startPosition, that.startPosition) &&
              //  Objects.equals(endPosition, that.endPosition) &&
                Objects.equals(cruise, that.cruise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateEntity, startPosition,
         //       endPosition,
                dayLog, sailsTime, engineTime, strongWindHours, cruise);
    }
}
