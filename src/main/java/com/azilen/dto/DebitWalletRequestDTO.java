package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class DebitWalletRequestDTO {
    private Long walletId;
    private String partnerPlayerId;
    private String partnerTransactionId;
    private String partnerTransactionDescription;
    private Integer tokensToDebit;
    private String transactionDateTime;
}
