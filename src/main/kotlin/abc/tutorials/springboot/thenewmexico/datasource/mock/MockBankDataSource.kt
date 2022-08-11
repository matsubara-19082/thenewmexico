package abc.tutorials.springboot.thenewmexico.datasource.mock

import abc.tutorials.springboot.thenewmexico.datasource.BankDataSource
import abc.tutorials.springboot.thenewmexico.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.13, 14),
        Bank("1010", 3.13, 0),
        Bank("5678", 0.0, 14),
    )

    override fun retriveBanks(): Collection<Bank> {
        return banks
    }
}