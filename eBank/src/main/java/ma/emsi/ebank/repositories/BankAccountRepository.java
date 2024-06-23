package ma.emsi.ebank.repositories;

import ma.emsi.ebank.entities.BankAccount;
import ma.emsi.ebank.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository <BankAccount,String> {

}
