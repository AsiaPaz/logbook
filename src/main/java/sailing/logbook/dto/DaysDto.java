package sailing.logbook.dto;

import sailing.logbook.dal.Position;

import java.time.LocalDate;

public class DaysDto {
    private LocalDate dateEntity;
    private Position startPosition;
    private Position endPosition;
    private float dayLog;
    private float sailsTime;
    private float engineTime;
    private float strongWindHours;

    public DaysDto(LocalDate dateEntity, Position startPosition, Position endPosition, float dayLog, float sailsTime, float engineTime, float strongWindHours) {
        this.dateEntity = dateEntity;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.dayLog = dayLog;
        this.sailsTime = sailsTime;
        this.engineTime = engineTime;
        this.strongWindHours = strongWindHours;
    }

    public DaysDto() {
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

    public Position getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Position endPosition) {
        this.endPosition = endPosition;
    }

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
}
