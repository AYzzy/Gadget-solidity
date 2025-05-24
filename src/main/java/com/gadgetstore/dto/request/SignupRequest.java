package com.gadgetstore.dto.request;

import lombok.Data;
import java.util.Set;

@Data
public class SignupRequest {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Set<String> roles;
}