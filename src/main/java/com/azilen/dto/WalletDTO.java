package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class WalletDTO {
    private Integer availableTokens;
    private Integer reservedTokens;
    private Integer totalTokens;
}
