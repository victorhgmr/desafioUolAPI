package victormr.desafiouol.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import victormr.desafiouol.model.Player;
import victormr.desafiouol.model.dtos.PlayerDTO;
import victormr.desafiouol.service.PlayerService;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    @PostMapping
    public ResponseEntity<Player> createPlayer(@RequestBody @Validated PlayerDTO player){
        Player newPlayer = service.createPlayer(player);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);


    }
}
