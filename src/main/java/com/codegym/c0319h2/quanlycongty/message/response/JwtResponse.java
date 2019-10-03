package com.codegym.c0319h2.quanlycongty.message.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
@Data
@AllArgsConstructor
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String userName;
    private Collection<?extends GrantedAuthority> authorities;

    public JwtResponse(String token, String userName, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.userName = userName;
        this.authorities = authorities;
    }
}
