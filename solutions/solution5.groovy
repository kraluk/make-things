final def START = 10
final def STOP = 20

for (def i = START; i <= STOP; i++) {
    println "$i"
}

println "--------------------"

for (i in START..STOP) {
    println "$i"
}

println "--------------------"

def numbers = START..STOP

for (i in numbers) {
    println "$i"
}

println "--------------------"

def i = START

while (i <= STOP) {
    println "$i"
    i++
}
