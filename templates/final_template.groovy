@Grab('org.codehaus.groovy.modules.http-builder:http-builder:0.7')
import groovyx.net.http.RESTClient

// Wczytanie wiadomosci
// System.in.newReader().readLine()

// Wczytanie typu wiadomosci - M lub S
// ---

def client = new RESTClient('http://localhost:8080/')

// Tutaj instrukcja warunkowa

// Dla maili
//def response = client.get(path : "mail/$address/$message")

// Dla SMSow
//def response = client.get(path : "sms/$number/$message")
