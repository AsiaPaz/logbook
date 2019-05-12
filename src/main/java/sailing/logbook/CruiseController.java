package sailing.logbook;

import org.springframework.web.bind.annotation.*;
import sailing.logbook.dal.Cruise;
import sailing.logbook.dal.CruiseRepository;
@RestController
@RequestMapping("/api/cruise")
public class CruiseController {
private CruiseRepository cruiseRepository;

    public CruiseController(CruiseRepository cruiseRepository) {
        this.cruiseRepository = cruiseRepository;
}

@PostMapping
    public void cruiseSave(@RequestBody Cruise cruise){
        cruiseRepository.save(cruise);
    }

@GetMapping
    public void cruiseGet(){
        cruiseRepository.findAll();
    }


}
