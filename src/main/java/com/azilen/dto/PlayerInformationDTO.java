package com.azilen.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class PlayerInformationDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String zipcode;
    private String email;
}
