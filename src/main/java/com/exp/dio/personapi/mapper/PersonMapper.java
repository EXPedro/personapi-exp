package com.exp.dio.personapi.mapper;

import com.exp.dio.personapi.dto.request.PersonDTO;
import com.exp.dio.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);    //MapStruct syntax MUST BE toModel()
    PersonDTO toDTO(Person person);    //MapStruct syntax MUST BE toDTO()
}
