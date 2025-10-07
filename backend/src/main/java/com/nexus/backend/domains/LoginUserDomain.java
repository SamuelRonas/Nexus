package com.nexus.backend.domains;

import lombok.Data;

@Data
public class LoginUserDomain {
    private String email;
    
    private String password;
}
