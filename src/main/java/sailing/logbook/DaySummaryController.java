package sailing.logbook;

import org.springframework.web.bind.annotation.*;
import sailing.logbook.dal.DaySummary;
import sailing.logbook.dal.DaySummaryRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/days")
public class DaySummaryController {
DaySummaryRepository daySummaryRepository;

    public DaySummaryController(DaySummaryRepository daySummaryRepository) {
        this.daySummaryRepository = daySummaryRepository;
    }

    @PostMapping
    public void addDaySummary(DaySummary daySummary){
        daySummaryRepository.save(daySummary);
    }

    @GetMapping
    public Collection<DaySummary> getAllDays(){
        return daySummaryRepository.findAll();
    }

    @GetMapping(params = "dateEntity")
    public Collection<DaySummary> getDayEntity(LocalDate dateEntity){
        return daySummaryRepository.findByDateEntity(dateEntity);
    }
    @GetMapping("/{id}")
    public Optional<DaySummary> getDaySummaryById(@PathVariable Integer id){
        return daySummaryRepository.findById(id);
    }
}
