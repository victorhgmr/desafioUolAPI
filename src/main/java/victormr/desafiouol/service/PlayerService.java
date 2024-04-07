package victormr.desafiouol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import victormr.desafiouol.infra.CodinameHandler;
import victormr.desafiouol.model.GroupType;
import victormr.desafiouol.model.Player;
import victormr.desafiouol.model.dtos.PlayerDTO;
import victormr.desafiouol.repositories.PlayerRepository;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public void savePlayer(Player player){
        this.repository.save(player);
    }

    public Player createPlayer(PlayerDTO dto){
        Player newplayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newplayer.setCodiname(codiname);
        return repository.save(newplayer);
    }

    public List<Player> getAllPlayers(){
        return this.repository.findAll();
    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }



}
