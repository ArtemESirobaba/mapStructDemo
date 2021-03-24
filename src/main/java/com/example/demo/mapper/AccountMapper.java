package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingAccount;
import com.example.demo.modeldto.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PersonMapper.class, CompanyMapper.class, AddressMapper.class, CustomerMapper.class})
public interface AccountMapper {

  @Mapping(source = "customer", target = "applyingCustomer")
  ApplyingAccount accountDTOToApplyingAccount(AccountDTO dto);

  List<ApplyingAccount> accountDTOToApplyingAccount(List<AccountDTO> dto);
}
