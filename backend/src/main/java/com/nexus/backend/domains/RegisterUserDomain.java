package com.nexus.backend.domains;

import lombok.Data;

@Data
public class RegisterUserDomain {
    private String email;
    
    private String password;
    
    private String fullName;
    
    
}
