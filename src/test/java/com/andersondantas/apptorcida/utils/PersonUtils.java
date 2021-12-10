package com.andersondantas.apptorcida.utils;

import com.andersondantas.apptorcida.dto.request.AddressDTO;
import com.andersondantas.apptorcida.dto.request.PersonDTO;
import com.andersondantas.apptorcida.dto.request.PhoneDTO;
import com.andersondantas.apptorcida.entity.Person;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class PersonUtils {

    private static final String FULL_NAME = "Anderson Dantas";
    private static final String NATIONALITY = "basileiro";
    private static final String CPF = "369.333.878-79";
    private static final String GENRE = "Masculino";
    private static final String NATURALNESS = "Fortaleza";
    private static final String OCCUPATION = "Analista de sistema";
    private static final String RG = "99002286130";
    private static final String EMAIL = "andersonddc@hotmail.com";
    private static final String MOTHER_NAME = "Vilannelma Dantas";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .fullName(FULL_NAME)
                .nationality(NATIONALITY)
                .birthDate("20-08-1981")
                .cpf(CPF)
                .genre(GENRE)
                .naturalness(NATURALNESS)
                .occupation(OCCUPATION)
                .rg(RG)
                .email(EMAIL)
                .motherName(MOTHER_NAME)
                .address(Collections.singletonList(AddressUtils.createFakeDTO()))
                .phone(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .fullName(FULL_NAME)
                .nationality(NATIONALITY)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .genre(GENRE)
                .naturalness(NATURALNESS)
                .occupation(OCCUPATION)
                .rg(RG)
                .email(EMAIL)
                .motherName(MOTHER_NAME)
                .address(Collections.singletonList(AddressUtils.createFakeEntity()))
                .phone(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
