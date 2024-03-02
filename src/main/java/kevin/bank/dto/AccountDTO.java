package kevin.bank.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private Long id;
    private String accountHolderName;
    private Double balance;
}
