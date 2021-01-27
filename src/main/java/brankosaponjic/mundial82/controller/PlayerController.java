package brankosaponjic.mundial82.controller;

import brankosaponjic.mundial82.entity.Player;
import brankosaponjic.mundial82.service.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/all")
    public Collection<Player> findAllPlayers() {
        return playerService.findAll();
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<Player> findByIdPlayer(@PathVariable("playerId") int id) {
        return playerService.findById(id);
    }

    @GetMapping("/team/{teamId}")
    public Collection<Player> playerByTeamId(@PathVariable("teamId") int teamId) {
        return playerService.playerByTeamId(teamId);
    }

    @PostMapping("/addOne")
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) throws URISyntaxException {
        return playerService.savePlayer(player);
    }

    @PostMapping("/addList")
    public ResponseEntity<List<Player>> addPlayerList(@RequestBody List<Player> playerList) throws URISyntaxException {
        return playerService.savePlayerList(playerList);
    }

    @PutMapping("/update/{playerId}")
    public void updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        playerService.updatePlayer(playerId, player);
    }

    @DeleteMapping("/delete/{playerId}")
    public ResponseEntity<Player> deletePlayerById(@PathVariable("playerId") int playerId) {
        return playerService.deletePlayerById(playerId);
    }
}

