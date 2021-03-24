package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingAddress;
import com.example.demo.modeldto.AddressDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AddressMapper {
  ApplyingAddress addressDTOToApplyingAddress(AddressDTO dto);

  List<ApplyingAddress> addressDTOToApplyingAddress(List<AddressDTO> dto);
}
