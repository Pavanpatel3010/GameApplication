package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AuthorizedWalletRequestDTO {
    private String partnerUserId;
    private String partnerCallBackUrl;
}
