package com.andersondantas.apptorcida.utils;

import com.andersondantas.apptorcida.dto.request.AddressDTO;
import com.andersondantas.apptorcida.entity.Address;

public class AddressUtils {

    private static final String STREET = "08599999-9999";
    private static final String DISTRICT = "Joaquim Távora";
    private static final String CITY = "Fortaleza";
    private static final int NUMBER = 606;
    private static final String STATE = "CE";
    private static final String POSTAL = "60130080";
    private static final long ADDRESS_ID = 1L;

    public static AddressDTO createFakeDTO() {
        return AddressDTO.builder()
                .street(STREET)
                .district(DISTRICT)
                .number(NUMBER)
                .city(CITY)
                .state(STATE)
                .postal(POSTAL)
                .build();
    }

    public static Address createFakeEntity() {
        return Address.builder()
                .id(ADDRESS_ID)
                .street(STREET)
                .district(DISTRICT)
                .number(NUMBER)
                .city(CITY)
                .state(STATE)
                .postal(POSTAL)
                .build();
    }
}
