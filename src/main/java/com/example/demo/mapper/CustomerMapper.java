package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingCustomer;
import com.example.demo.modeldto.CustomerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring",
  uses = {PersonMapper.class, CompanyMapper.class, AddressMapper.class})
public interface CustomerMapper {

  @Mapping(source = "accounts", target = "applyingAccounts")
  ApplyingCustomer customerDTOToApplyingCustomer(CustomerDTO dto);

  @Mapping(source = "accounts", target = "applyingAccounts")
  List<ApplyingCustomer> customerDTOToApplyingCustomer(List<CustomerDTO> dto);

}
