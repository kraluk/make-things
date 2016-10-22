@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7')
import groovyx.net.http.RESTClient

println "Please enter your message:"
def message = System.in.newReader().readLine()

println "\nPlease enter type of your message -> M(ail) or S(MS):"
def type = System.in.newReader().readLine()

def client = new RESTClient('http://localhost:8080/')

switch (type) {
    
    case "M":
        println "\nPlease enter valid email address:"
        def address = System.in.newReader().readLine()
        
        def response = client.get(path : "mail/$address/$message")
        println "\nResponse = $response.status"
    break

    case "S":
        println "\nPlease enter valid phone number:"
        def number = System.in.newReader().readLine()
        
        def response = client.get(path : "sms/$number/$message")
        println "\nResponse = $response.status"
    break

    default:
        println "Illegal message type! Permitted are only M or S!"
}
