package com.codegym.c0319h2.quanlycongty.message.request;

import com.codegym.c0319h2.quanlycongty.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Set;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class CreateUserForm {
    @Size(min = 4,max = 50)
    private String userName;
    @Size(min = 4,max = 50)
    private String passWord;
//    @Email
    private String email;
    private Set<String> role;

    public CreateUserForm() {
    }

    public CreateUserForm(@Size(min = 4, max = 50) String userName, @Size(min = 4, max = 50) String passWord, String email, Set<String> role) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRole() {
        return role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
