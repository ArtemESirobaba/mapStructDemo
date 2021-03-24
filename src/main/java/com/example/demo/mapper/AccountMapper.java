package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingAccount;
import com.example.demo.modeldto.AccountDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper extends DtoMapper<AccountDTO, ApplyingAccount> {

  @Override
  ApplyingAccount toApplying(AccountDTO dto);

  @Override
  List<ApplyingAccount> toApplying(List<AccountDTO> dto);

  default AccountDTO fromId (Integer id) {
    if (id == null) {
      return null;
    }
    AccountDTO account = new AccountDTO();
    account.setId(id);
    return account;
  }
}
