package brankosaponjic.mundial82.controller;

import brankosaponjic.mundial82.entity.Team;
import brankosaponjic.mundial82.service.TeamService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class TeamController {

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @GetMapping("/team/all")
    public Collection<Team> findAllTeams() {
        return teamService.findAll();
    }

    @GetMapping("/team/{id}")
    public Team findByIdTeam(@PathVariable("id") int id) {
        return teamService.findById(id);
    }
}
