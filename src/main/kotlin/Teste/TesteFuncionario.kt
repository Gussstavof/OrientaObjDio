package Teste

import one.digitainnovation.digionebank.Funcionario
import one.digitainnovation.digionebank.Pessoa

fun main(){
    val Gustavo = Pessoa(nome = "Gustavo", cpf = "12345679")
    println(Gustavo.nome)
    println(Gustavo.cpf)

    val  Maria = Funcionario(nome = "Maria", cpf = "123", salario =  2000.0)
    println(Maria.nome)
    println(Maria.cpf)
    println(Maria.salario)
    }