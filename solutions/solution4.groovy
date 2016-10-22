def balance = 2000.00
def amount = 2000.00

if (amount > balance) {
    println "Your balance ($balance) is insufficient to do given withdrawal ($amount)!"
} else {
    balance = balance - amount
    println "Your balance after withdrawal ($amount): $balance"
}
