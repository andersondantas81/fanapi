package com.andersondantas.apptorcida.service;

import com.andersondantas.apptorcida.dto.request.PersonDTO;
import com.andersondantas.apptorcida.dto.response.MessageResponseDTO;
import com.andersondantas.apptorcida.entity.Person;
import com.andersondantas.apptorcida.mapper.PersonMapper;
import com.andersondantas.apptorcida.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created personDTO with ID " + savedPerson.getId())
                .build();
    }
}
