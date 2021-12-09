package com.andersondantas.apptorcida.dto.request;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AddressDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String street;

    @NotEmpty
    @Size(min = 2, max = 60)
    private String district;

    private int number;

    @NotEmpty
    @Size(min = 2, max = 60)
    private String city;

    @NotEmpty
    @Size(min = 2, max = 60)
    private String state;

    @NotEmpty
    @Size(min = 8)
    private String postal;
}
