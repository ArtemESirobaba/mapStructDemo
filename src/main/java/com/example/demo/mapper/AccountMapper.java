package com.example.demo.mapper;


import com.example.demo.modelapplying.ApplyingAccount;
import com.example.demo.modeldto.AccountDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AccountMapper {

  ApplyingAccount accountDTOToApplyingAccount(AccountDTO dto);

  List<ApplyingAccount> accountDTOToApplyingAccount(List<AccountDTO> dto);

}
