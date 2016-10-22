static void main(String[] args) {

    if (args.size() < 2) {
        println "Illegal invocation! Proper example: groovy solution4_1.groovy BALANACE AMOUNT"
        System.exit(1)
    }

    def balance = new BigDecimal(args[0])
    def amount = new BigDecimal(args[1])

    if (amount > balance) {
        println "Your balance ($balance) is insufficient to do given withdrawal ($amount)!"
    } else {
        balance = balance - amount
        println "Your balance after withdrawal ($amount): $balance"
    }
}
