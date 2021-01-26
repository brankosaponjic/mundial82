package brankosaponjic.mundial82.service;

import brankosaponjic.mundial82.entity.Team;
import brankosaponjic.mundial82.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team findById(int id) {
        return teamRepository.findById(id).orElse(null);
    }

    public Collection<Team> findAll() {
        return teamRepository.findAll();
    }
}
