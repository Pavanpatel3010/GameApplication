package com.azilen.service;

import com.azilen.dto.*;
import com.azilen.repository.PlayerInformationRepository;
import com.azilen.repository.PlayerRepository;
import com.azilen.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private PlayerInformationRepository playerInformationRepository;
    @Autowired
    private WalletRepository walletRepository;

    public AuthorizedWalletResponseDTO authorizedWallet(AuthorizedWalletRequestDTO authorizedWalletRequestDTO){
        return null;
    }

    public CreditWalletResponseDTO creditWallet(Long walletId, CreditWalletRequestDTO creditWalletRequestDTO){
        return null;
    }

    public DebitWalletResponseDTO debitWallet(DebitWalletRequestDTO debitWalletRequestDTO){
        return null;
    }
}
