package kevin.bank.service.impl;

import kevin.bank.dto.AccountDTO;
import kevin.bank.entity.Account;
import kevin.bank.mapper.AccountMapper;
import kevin.bank.repository.AccountRepository;
import kevin.bank.service.AccountService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        // Menggunakan AccountMapper untuk mengonversi dari AccountDTO ke objek Account
        Account account = AccountMapper.mapToAccount(accountDTO);

        // Menyimpan objek Account ke repositori (mungkin berupa database)
        Account saveAccount = accountRepository.save(account);

        // Menggunakan AccountMapper untuk mengonversi dari objek Account yang telah disimpan
        // menjadi objek AccountDTO yang akan dikembalikan
        return AccountMapper.mapToAccountDTO(saveAccount);
    }
}
