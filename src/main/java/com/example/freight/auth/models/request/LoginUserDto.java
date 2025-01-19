package com.example.freight.auth.models.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginUserDto {

    private String email;
    private String password;
}
