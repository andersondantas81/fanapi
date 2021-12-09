package com.andersondantas.apptorcida.dto.request;

import com.andersondantas.apptorcida.entity.Address;
import com.andersondantas.apptorcida.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String fullName;

    @NotEmpty
    private String nationality;

    private String birthDate;

    private String genre;

    @NotEmpty
    private String naturalness;

    private String occupation;

    @NotEmpty
    @CPF
    private String cpf;

    @NotEmpty
    @Size(min = 8)
    private String rg;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String motherName;

    @Valid
    @NotEmpty
    private List<Address> address;

    @Valid
    @NotEmpty
    private List<Phone> phone;
}
