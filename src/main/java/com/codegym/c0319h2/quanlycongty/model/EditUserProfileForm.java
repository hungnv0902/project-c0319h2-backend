package com.codegym.c0319h2.quanlycongty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EditUserProfileForm {
    private String avatar;
    private LocalDate birthDate;

    @Pattern(regexp = "/^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$/")
    private String phoneNumber;
    private String address;
}
