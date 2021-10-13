package com.example.demo.authentication;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AuthenticationRequest {
    @NotNull
    private final String email;
    @NotNull
    private final String password;
}
