package ejemplo.persistencia_s4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ejemplo.persistencia_s4.model.Banda;
import ejemplo.persistencia_s4.repository.BandaRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class BandaService {
    @Autowired
    private BandaRepository bandaRepository;

    public Banda crear(Banda banda) {
        return bandaRepository.save(banda);
    }

    public List<Banda> listarTodas() {
        return bandaRepository.findAll();
    }
    
}
