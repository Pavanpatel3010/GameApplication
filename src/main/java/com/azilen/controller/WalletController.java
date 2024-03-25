package com.azilen.controller;

import com.azilen.dto.*;
import com.azilen.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @PostMapping("/authorizedWallet")
    public AuthorizedWalletResponseDTO authorizedWallet(@RequestBody AuthorizedWalletRequestDTO authorizedWalletRequestDTO){
        return walletService.authorizedWallet(authorizedWalletRequestDTO);
    }

    @PutMapping("/playerWallet/{walletId}")
    public CreditWalletResponseDTO creditWallet(@RequestBody CreditWalletRequestDTO creditWalletRequestDTO, @PathVariable Long walletId){
        return walletService.creditWallet(walletId, creditWalletRequestDTO);
    }

    @PostMapping("/playerDebit")
    public DebitWalletResponseDTO debitWallet(@RequestBody DebitWalletRequestDTO debitWalletRequestDTO){
        return walletService.debitWallet(debitWalletRequestDTO);
    }
}
