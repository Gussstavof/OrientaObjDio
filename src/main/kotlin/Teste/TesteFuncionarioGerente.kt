package Teste


import one.digitainnovation.digionebank.Gerente
import one.digitainnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){

    val  Maria = Gerente(nome = "Maria", cpf = "123456789", salario =  5000.0, senha = "senha123")
    ImprimeRelatorioFuncionario.imprime(Maria)

    TesteAutenticacao().autentica(Maria)

    }
