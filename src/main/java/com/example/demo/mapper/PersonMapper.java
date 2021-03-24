package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingCustomer;
import com.example.demo.modelapplying.ApplyingPerson;
import com.example.demo.modeldto.CustomerDTO;
import com.example.demo.modeldto.PersonDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PersonMapper extends DtoMapper<PersonDTO, ApplyingPerson> {
  @Override
  ApplyingPerson toApplying(PersonDTO dto);

  @Override
  List<ApplyingPerson> toApplying(List<PersonDTO> dto);

  default PersonDTO fromId (Integer id) {
    if (id == null) {
      return null;
    }
    PersonDTO person = new PersonDTO();
    person.setId(id);
    return person;
  }
}
