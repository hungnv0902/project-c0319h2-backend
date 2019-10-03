package com.codegym.c0319h2.quanlycongty.message.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class LogInForm {
    @NotBlank
    @Size(min = 4,max = 50)
    private String userName;
    @NotBlank
    @Size(min = 6,max = 50)
    private String passWord;

    public LogInForm(@NotBlank @Size(min = 4, max = 50) String userName, @NotBlank @Size(min = 6, max = 50) String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public LogInForm() {
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
}
