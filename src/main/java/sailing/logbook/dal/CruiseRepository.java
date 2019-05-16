package sailing.logbook.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CruiseRepository extends JpaRepository<Cruise, Integer>{
    List<Cruise> findAll();
    List<Cruise> findById(int id);
 }
