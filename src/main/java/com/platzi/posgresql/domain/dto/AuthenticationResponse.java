package com.platzi.posgresql.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AuthenticationResponse {
    private String jwt;
}
