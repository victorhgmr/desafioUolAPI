package victormr.desafiouol.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import victormr.desafiouol.model.Player;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Optional<Player> findUserByEmail(String Email);
    Optional<Player> findUserById(Long id);
}
