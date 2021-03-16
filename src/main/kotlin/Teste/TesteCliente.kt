package Teste

import one.digitainnovation.digionebank.Cliente
import one.digitainnovation.digionebank.ClienteTipo

fun main() {
    val jhou = Cliente (
        nome = " jhou ",
        cpf = "123456789",
        clienteTipo = ClienteTipo.pf,
        senha =  "123456"

    )

    println(jhou)

    TesteAutenticacao().autentica(jhou)
}




