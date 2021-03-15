package Teste

import one.digitainnovation.digionebank.Banco

fun main() {
    val DigiOneBank = Banco( nome = "DigiOne", numero = 12)

    println(DigiOneBank.info())


    val banco2 = DigiOneBank.copy(nome = "ABC")

    println(banco2.info())


}