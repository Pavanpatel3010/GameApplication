package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreditWalletRequestDTO {
    private String partnerUserId;
    private Integer tokensToAdd;
}
