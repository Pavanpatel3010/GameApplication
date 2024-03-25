package com.azilen.service;

import com.azilen.dto.PlayerInformationDTO;
import com.azilen.dto.PlayerWalletRequestDTO;
import com.azilen.dto.PlayerWalletResponseDTO;
import com.azilen.dto.WalletDTO;
import com.azilen.entity.Player;
import com.azilen.entity.PlayerInformation;
import com.azilen.entity.Wallet;
import com.azilen.repository.PlayerInformationRepository;
import com.azilen.repository.PlayerRepository;
import com.azilen.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PlayerInformationRepository playerInformationRepository;
    @Autowired
    private WalletRepository walletRepository;

    public PlayerWalletResponseDTO createPlayerWallet(PlayerWalletRequestDTO playerWalletRequestDTO){
        Player player = new Player();
        player.setPartnerUserId(playerWalletRequestDTO.getPartnerUserId());
        Player savedPlayer = playerRepository.save(player);

        PlayerInformationDTO playerInformationDTO = playerWalletRequestDTO.getUserInformation();
        PlayerInformation playerInformation = new PlayerInformation();
        playerInformation.setAddress1(playerInformationDTO.getAddress1());
        playerInformation.setAddress2(playerInformationDTO.getAddress2());
        playerInformation.setCity(playerInformationDTO.getCity());
        playerInformation.setEmail(playerInformationDTO.getEmail());
        playerInformation.setState(playerInformationDTO.getState());
        playerInformation.setFirstName(playerInformationDTO.getFirstName());
        playerInformation.setLastName(playerInformationDTO.getLastName());
        playerInformation.setZipcode(playerInformationDTO.getZipcode());
        playerInformation.setPhoneNumber(playerInformationDTO.getPhoneNumber());
        playerInformation.setPlayer(savedPlayer);

        PlayerInformation savedPlayerInformation = playerInformationRepository.save(playerInformation);

        Wallet wallet = new Wallet();
        wallet.setAvailableTokens(0);
        wallet.setTotalTokens(0);
        wallet.setReservedTokens(0);
        wallet.setPlayer(savedPlayer);

        Wallet savedWallet = walletRepository.save(wallet);

        WalletDTO walletDTO = new WalletDTO();
        walletDTO.setAvailableTokens(savedWallet.getAvailableTokens());
        walletDTO.setTotalTokens(savedWallet.getTotalTokens());
        walletDTO.setReservedTokens(savedWallet.getReservedTokens());

        PlayerInformationDTO playerInformationDTOResponse = new PlayerInformationDTO();
        playerInformationDTOResponse.setCity(savedPlayerInformation.getCity());
        playerInformationDTOResponse.setEmail(savedPlayerInformation.getEmail());
        playerInformationDTOResponse.setState(savedPlayerInformation.getState());
        playerInformationDTOResponse.setZipcode(savedPlayerInformation.getZipcode());
        playerInformationDTOResponse.setAddress2(savedPlayerInformation.getAddress2());
        playerInformationDTOResponse.setAddress1(savedPlayerInformation.getAddress1());
        playerInformationDTOResponse.setFirstName(savedPlayerInformation.getFirstName());
        playerInformationDTOResponse.setLastName(savedPlayerInformation.getLastName());
        playerInformationDTOResponse.setPhoneNumber(savedPlayerInformation.getPhoneNumber());

        PlayerWalletResponseDTO playerWalletResponseDTO = new PlayerWalletResponseDTO();
        playerWalletResponseDTO.setWalletDTO(walletDTO);
        playerWalletResponseDTO.setPartnerUserId(playerWalletRequestDTO.getPartnerUserId());
        playerWalletResponseDTO.setUserInformation(playerInformationDTOResponse);
        return playerWalletResponseDTO;
    }
}
