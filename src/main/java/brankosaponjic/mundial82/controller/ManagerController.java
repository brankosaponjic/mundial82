package brankosaponjic.mundial82.controller;

import brankosaponjic.mundial82.entity.Manager;
import brankosaponjic.mundial82.service.ManagerService;
import brankosaponjic.mundial82.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/manager")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService, PlayerService playerService) {
        this.managerService = managerService;
    }

    @GetMapping("/all")
    public Collection<Manager> findAllManagers() {
        return managerService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Manager> findByIdManager(@PathVariable("id") int id) {
        return managerService.findById(id);
    }

}
