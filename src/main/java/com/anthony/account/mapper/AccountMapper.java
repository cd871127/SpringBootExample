package com.anthony.account.mapper;

import com.anthony.account.dto.AccountDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {

    /**
     * by userId
     * by accountId
     * by PwdModifyDate
     * @return AccountDTO
     */
    List<AccountDTO> getAccountDTO();
}
