package sailing.logbook.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface HourRepository  extends JpaRepository<HourEntity, Integer> {
    Collection<HourEntity> findHourEntitiesByDateEntity(LocalDate dateEntity);
    Collection<HourEntity> findHourEntitiesByDateEntityAndTimeLog(LocalDate dateEntity, int timeLog);
    Collection<HourEntity> findById(int id);
 //   Collection<HourEntity> findHourEntitiesByWatch(String watch);

}
