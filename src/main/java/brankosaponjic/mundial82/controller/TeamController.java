package brankosaponjic.mundial82.controller;

import brankosaponjic.mundial82.entity.Team;
import brankosaponjic.mundial82.service.TeamService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/team")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/all")
    public Collection<Team> findAllTeams() {
        return teamService.findAll();
    }

    @GetMapping("/{id}")
    public Team findByIdTeam(@PathVariable("id") int id) {
        return teamService.findById(id);
    }
}
