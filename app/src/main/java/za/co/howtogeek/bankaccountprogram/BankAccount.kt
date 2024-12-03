package za.co.howtogeek.bankaccountprogram

import kotlin.concurrent.fixedRateTimer

class BankAccount(
    var accountHolder: String,
    var balance: Double)
{

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder deposited R$amount.") // \nNew balance: R$balance.")
    }

    fun withdraw(amount: Double){
        if (amount <= balance){
            // We can withdraw
            balance -= amount
            transactionHistory.add("$accountHolder withdrew R$amount.\nNew balance: R$balance.")
        } else {
            // We can't withdraw the money
            println("Insufficient funds to withdraw R$amount.")
        }

    }

    fun displayTransactionHistory(){
        println("Transaction history for $accountHolder")
        // Without index:
        for (transaction in transactionHistory) {
            println(transaction)
        }
        println("____________________________________________\nBalance:\n$balance")




        /* With index:
        if (transactionHistory.size > 0){
            for (index in 0 until transactionHistory.size){
                println(transactionHistory.get(index))
            }
        } else
            println("No Transaction history.")
         */
    }
}