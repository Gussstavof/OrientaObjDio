package Teste

import one.digitainnovation.digionebank.Analista
import one.digitainnovation.digionebank.ImprimeRelatorioFuncionario


fun main(){

    val  Maria = Analista(nome = "Maria", cpf = "123456789", salario =  2000.0)
    ImprimeRelatorioFuncionario.imprime(Maria)

    }
