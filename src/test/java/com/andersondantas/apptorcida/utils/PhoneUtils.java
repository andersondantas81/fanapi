package com.andersondantas.apptorcida.utils;

import com.andersondantas.apptorcida.dto.request.PhoneDTO;
import com.andersondantas.apptorcida.entity.Phone;

public class PhoneUtils {

    private static final String MOBILE = "08599999-9999";
    private static final String HOME = "0858888-8888";
    private static final String COMMERCIAL = "";
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .home(HOME)
                .mobile(MOBILE)
                .commercial(COMMERCIAL)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .mobile(MOBILE)
                .home(HOME)
                .commercial(COMMERCIAL)
                .build();
    }
}
