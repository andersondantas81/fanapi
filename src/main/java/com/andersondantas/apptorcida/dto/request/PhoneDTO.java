package com.andersondantas.apptorcida.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhoneDTO {

    private Long id;

    private String home;

    @NotEmpty
    @Size(min = 13, max = 14)
    private String mobile;

    private String commercial;
}
