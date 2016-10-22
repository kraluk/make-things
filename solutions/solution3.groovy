final def TEXT = "MAKETHINGS"

println "Please enter the '$TEXT' phrase:"
def phrase = System.in.newReader().readLine()

def result = TEXT.equalsIgnoreCase(phrase)
println "\nResult = $result"
