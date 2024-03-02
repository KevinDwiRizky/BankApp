package kevin.bank.service;

import kevin.bank.dto.AccountDTO;

public interface AccountService {
    AccountDTO createAccount(AccountDTO account);

    AccountDTO getAccountById(Long id);

    AccountDTO deposit(Long id, Double amount);

    AccountDTO withDraw(Long id, Double amount);
}
