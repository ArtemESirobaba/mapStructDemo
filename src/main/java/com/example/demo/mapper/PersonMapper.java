package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingCustomer;
import com.example.demo.modelapplying.ApplyingPerson;
import com.example.demo.modeldto.CustomerDTO;
import com.example.demo.modeldto.PersonDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
  uses = AddressMapper.class)
public interface PersonMapper {

  ApplyingPerson personDTOToApplyingPerson(PersonDTO dto);

  List<ApplyingPerson> personDTOToApplyingPerson(List<PersonDTO> dto);

}
