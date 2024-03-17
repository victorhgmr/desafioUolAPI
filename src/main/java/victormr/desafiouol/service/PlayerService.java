package victormr.desafiouol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import victormr.desafiouol.model.Player;
import victormr.desafiouol.model.dtos.PlayerDTO;
import victormr.desafiouol.repositories.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public void savePlayer(Player player){
        this.repository.save(player);
    }

    public Player createPlayer(PlayerDTO dto){
        Player newplayer = new Player(dto);
        this.savePlayer(newplayer);
        return newplayer;
    }

    public List<Player> getAllPlayers(){
        return this.repository.findAll();
    }

}
