package sailing.logbook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sailing.logbook.dal.HourEntity;
import sailing.logbook.dal.HourRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/hours")
public class HoursController {
    private HourRepository hourRepository;

    public HoursController(HourRepository hourRepository) {
        this.hourRepository = hourRepository;
    }

    @PostMapping
    public void addHoursEntity(HourEntity hourEntity){
        hourRepository.save(hourEntity);
    }

   @GetMapping
    public List<HourEntity> getAllHours(){
    return hourRepository.findAll();
   }

   @GetMapping(params = "dateEntity")
    public Collection<HourEntity> getHoursByDateEntity(LocalDate dateEntity){
        return hourRepository.findHourEntitiesByDateEntity(dateEntity);
   }

   @GetMapping(params="dateEntity, timeLog")
    public Collection<HourEntity> getHoursByDateAndLogTime(LocalDate dateEntity, int timeLog) {
       return hourRepository.findHourEntitiesByDateEntityAndTimeLog(dateEntity, timeLog);
   }
    @GetMapping("/{id}")
    public Optional<HourEntity> getHoursById(Integer id){
        return hourRepository.findById(id);
    }

}











