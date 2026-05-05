package ejemplo.persistencia_s4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ejemplo.persistencia_s4.model.Banda;

@Repository
public interface BandaRepository extends JpaRepository<Banda, Long> {
    
}
