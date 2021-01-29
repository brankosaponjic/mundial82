package brankosaponjic.mundial82.service;

import brankosaponjic.mundial82.entity.Player;
import brankosaponjic.mundial82.repository.PlayerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public Collection<Player> findAll() {
        return playerRepository.findAll();
    }

    public ResponseEntity<Player> findById(int id) {
        Optional<Player> player = playerRepository.findById(id);
        return player.map(ResponseEntity::ok)
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public Collection<Player> playerByTeamId(int id) {
        return playerRepository.findPlayersByTeamIdOrderByBackNumber(id);
    }

    public ResponseEntity<Player> savePlayer(Player player) throws URISyntaxException {
        Player pl = playerRepository.save(player);
        return ResponseEntity.created(new URI("/api/v1/player/addOne" + pl.getPlayerId())).body(pl);
    }

    public ResponseEntity<List<Player>> savePlayerList(List<Player> playerList) throws URISyntaxException {
        List<Player> players = playerRepository.saveAll(playerList);
        return ResponseEntity.created(new URI("/api/v1/player/addList")).body(players);
    }

    public void updatePlayer(int id, Player newPlayer) {
        Optional<Player> player = playerRepository.findById(id);
        player.ifPresent(pl -> {
            pl.setBackNumber(newPlayer.getBackNumber());
            pl.setName(newPlayer.getName());
            pl.setPosition(newPlayer.getPosition());
            pl.setDayOfBirth(newPlayer.getDayOfBirth());
            pl.setTeamId(newPlayer.getTeamId());
        });
        player.ifPresent(playerRepository::save);
    }

    public ResponseEntity<Player> deletePlayerById(int id) {
        playerRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
