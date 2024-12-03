package za.co.howtogeek.bankaccountprogram

fun main(){
    val dilshanBankAccount = BankAccount("Dilshan Tillakaratne", 31037.37)
    dilshanBankAccount.deposit(200.0)
    dilshanBankAccount.withdraw(1200.00)
    dilshanBankAccount.deposit(3000.00)
    dilshanBankAccount.deposit(2000.00)
    dilshanBankAccount.withdraw(3333.15)
    dilshanBankAccount.displayTransactionHistory()

    println("\n\n")

    val sarahBankAccount = BankAccount("Sarah", 0.0)
    sarahBankAccount.deposit(100.00)
    sarahBankAccount.withdraw(10.00)
    sarahBankAccount.deposit(300.00)
    sarahBankAccount.displayTransactionHistory()
}