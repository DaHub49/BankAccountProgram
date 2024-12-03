package za.co.howtogeek.bankaccountprogram

fun main(){
    val dilshanBankAccount = BankAccount("Dilshan Tillakaratne", 31037.37)

    //println("dilshanBankAccount.accountHolder: ${dilshanBankAccount.accountHolder}")

    dilshanBankAccount.deposit(200.0)
    dilshanBankAccount.withdraw(1200.00)
    dilshanBankAccount.deposit(3000.00)
    dilshanBankAccount.deposit(2000.00)
    dilshanBankAccount.withdraw(3333.15)

    dilshanBankAccount.displayTransactionHistory()
}