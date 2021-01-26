package brankosaponjic.mundial82.controller;

import brankosaponjic.mundial82.entity.Manager;
import brankosaponjic.mundial82.service.ManagerService;
import brankosaponjic.mundial82.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class ManagerController {

    private final ManagerService managerService;

    public ManagerController(ManagerService managerService, PlayerService playerService) {
        this.managerService = managerService;
    }

    @GetMapping("/manager/all")
    public Collection<Manager> findAllManagers() {
        return managerService.findAll();
    }

    @GetMapping("/manager/{id}")
    public ResponseEntity<Manager> findByIdManager(@PathVariable("id") int id) {
        return managerService.findById(id);
    }

}
