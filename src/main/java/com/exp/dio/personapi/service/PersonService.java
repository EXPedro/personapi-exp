package com.exp.dio.personapi.service;

import com.exp.dio.personapi.dto.MessageResponseDTO;
import com.exp.dio.personapi.dto.request.PersonDTO;
import com.exp.dio.personapi.entity.Person;
import com.exp.dio.personapi.exception.PersonNotFoundException;
import com.exp.dio.personapi.mapper.PersonMapper;
import com.exp.dio.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private PersonRepository personRepository;
    private final PersonMapper personMapper = PersonMapper.INSTANCE;    //constant created in the interface

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody PersonDTO personDTO){
        /*
        * MapStruct Library:
        * converts an entity to dto, and a dto to an entity
        */
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        return allPeople.stream()
                .map(personMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {

        /*
        Optional<Person> optionalPerson = personRepository.findById(id);
            if (optionalPerson.isEmpty()) {
                throw new PersonNotFoundException(id);
            } // before 'improvement' below
        */
        Person person = personRepository.findById(id)
                                        .orElseThrow(() -> new PersonNotFoundException(id));
        return personMapper.toDTO(person);
    }
}
