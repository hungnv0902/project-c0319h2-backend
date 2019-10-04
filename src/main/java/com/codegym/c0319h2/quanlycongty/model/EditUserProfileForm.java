package com.codegym.c0319h2.quanlycongty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class EditUserProfileForm {
    private String avatar;
    private String birthDate;

    @Pattern(regexp = "/^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$/")
    private String phoneNumber;
    private String address;

    public EditUserProfileForm() {
    }

    public EditUserProfileForm(String avatar, String birthDate, @Pattern(regexp = "/^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$/") String phoneNumber, String address) {
        this.avatar = avatar;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
