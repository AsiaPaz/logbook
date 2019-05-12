package sailing.logbook.dto;

import sailing.logbook.dal.HourEntity;

public class HoursDtoConverter {

    public static HoursDto hoursFromEntity(HourEntity hourEntity){
       HoursDto hoursDto = new HoursDto();
       hoursDto.setTimeLog(hourEntity.getTimeLog());
       hoursDto.setDateEntity(hourEntity.getDateEntity());
       hoursDto.setWatch(hourEntity.getWatch());
       hoursDto.setPosition(hourEntity.getPosition());
       hoursDto.setNavigation(hourEntity.getNavigation());
       hoursDto.setSails(hourEntity.getSails());
       hoursDto.setEngine(hourEntity.getEngine());
       hoursDto.setMeteo(hoursDto.getMeteo());
       hoursDto.setComments(hourEntity.getComments());
       return hoursDto;
    }

    public static HourEntity hoursToEntity(HoursDto hoursDto){
        HourEntity hourEntity = new HourEntity();
        hourEntity.setTimeLog(hoursDto.getTimeLog());
        hourEntity.setDateEntity(hoursDto.getDateEntity());
        hourEntity.setWatch(hoursDto.getWatch());
        hourEntity.setPosition(hoursDto.getPosition());
        hourEntity.setNavigation(hoursDto.getNavigation());
        hourEntity.setSails(hoursDto.getSails());
        hourEntity.setEngine(hoursDto.getEngine());
        hourEntity.setMeteo(hoursDto.getMeteo());
        hourEntity.setComments(hoursDto.getComments());
        return hourEntity;
    }

}
