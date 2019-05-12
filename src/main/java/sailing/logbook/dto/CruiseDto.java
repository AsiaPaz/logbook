package sailing.logbook.dto;

import java.time.LocalDate;

public class CruiseDto {
    private String route;
    private String yachtName;
    private LocalDate startDate;
    private LocalDate endDate;

    public CruiseDto(String route, String yachtName, LocalDate startDate, LocalDate endDate) {
        this.route = route;
        this.yachtName = yachtName;
        this.startDate = startDate;
        this.endDate = endDate;
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
