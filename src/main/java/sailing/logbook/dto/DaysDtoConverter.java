package sailing.logbook.dto;

import sailing.logbook.dal.DaySummary;

public class DaysDtoConverter {
    public static DaysDto daysFromEntity(DaySummary daySummary){
        DaysDto daysDto = new DaysDto();
        daysDto.setDateEntity(daySummary.getDateEntity());
        daysDto.setStartPosition(daySummary.getStartPosition());
      //  daysDto.setEndPosition(daySummary.getEndPosition());
        daysDto.setDayLog(daySummary.getDayLog());
        daysDto.setSailsTime(daySummary.getSailsTime());
        daysDto.setEngineTime(daySummary.getEngineTime());
        daysDto.setStrongWindHours(daySummary.getStrongWindHours());
    return daysDto;
    }

public static DaySummary daysToEntity(DaysDto daysDto){
        DaySummary daySummary = new DaySummary();
        daySummary.setDateEntity(daysDto.getDateEntity());
        daySummary.setStartPosition(daysDto.getStartPosition());
 //       daySummary.setEndPosition(daysDto.getEndPosition());
        daySummary.setDayLog(daysDto.getDayLog());
        daySummary.setSailsTime(daysDto.getSailsTime());
        daySummary.setEngineTime(daysDto.getEngineTime());
        daySummary.setStrongWindHours(daysDto.getStrongWindHours());
        return daySummary;
    }

 }
