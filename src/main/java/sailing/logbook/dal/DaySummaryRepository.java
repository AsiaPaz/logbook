package sailing.logbook.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;

public interface DaySummaryRepository extends JpaRepository<DaySummary,Integer> {
    Collection<DaySummary> findByDateEntity(LocalDate dateEntity);
}
