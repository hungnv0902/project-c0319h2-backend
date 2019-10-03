package com.codegym.c0319h2.quanlycongty.message.request;

import com.codegym.c0319h2.quanlycongty.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserForm {
    @Size(min = 4,max = 50)
    private String userName;
    @Size(min = 4,max = 50)
    private String passWord;
    @Email
    private String email;
    private Set<Role> role;
}
