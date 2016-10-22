def withdraw(Number balance, Number amount) {

    if (amount > balance) {
        println "Your balance ($balance) is insufficient to do given withdrawal ($amount)!"
    } else {
        balance = balance - amount
        println "Your balance after withdrawal ($amount): $balance"
    }
}

withdraw(5000, 1000)
withdraw(1000, 5000)
withdraw(1000, 1000)
