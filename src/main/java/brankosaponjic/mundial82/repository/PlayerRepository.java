package brankosaponjic.mundial82.repository;

import brankosaponjic.mundial82.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>  {
    Collection<Player> findPlayersByTeamIdOrderByBackNumber(int teamId);
}
