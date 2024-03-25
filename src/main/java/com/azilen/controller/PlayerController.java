package com.azilen.controller;

import com.azilen.dto.PlayerWalletRequestDTO;
import com.azilen.dto.PlayerWalletResponseDTO;
import com.azilen.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/playerWallet")
    public PlayerWalletResponseDTO createPlayerWallet(@RequestBody PlayerWalletRequestDTO playerWalletRequestDTO){
        return playerService.createPlayerWallet(playerWalletRequestDTO);
    }
}
