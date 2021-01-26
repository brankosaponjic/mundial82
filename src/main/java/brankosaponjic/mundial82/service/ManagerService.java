package brankosaponjic.mundial82.service;

import brankosaponjic.mundial82.entity.Manager;
import brankosaponjic.mundial82.repository.ManagerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ManagerService {
    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public Collection<Manager> findAll() {
        return managerRepository.findAll();
    }

    public ResponseEntity<Manager> findById(int id) {
        Optional<Manager> manager = managerRepository.findById(id);
        return manager.map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
