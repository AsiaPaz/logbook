package sailing.logbook;

import org.springframework.web.bind.annotation.*;
import sailing.logbook.dal.Cruise;
import sailing.logbook.dal.CruiseRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cruise")
public class CruiseController {
private CruiseRepository cruiseRepository;

    public CruiseController(CruiseRepository cruiseRepository) {
        this.cruiseRepository = cruiseRepository;
}

@PostMapping
    public void addCruise(@RequestBody Cruise cruise){
        cruiseRepository.save(cruise);
    }

@GetMapping
    public List<Cruise> getCruise(){
        cruiseRepository.findAll();
        return cruiseRepository.findAll();
    }

@GetMapping("/id")
    public List<Cruise> getCruiseById(@PathVariable int id){
        return cruiseRepository.findById(id);
}
}
