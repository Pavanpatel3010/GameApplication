package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PlayerWalletRequestDTO {
    private String partnerUserId;
    private PlayerInformationDTO userInformation;
}
