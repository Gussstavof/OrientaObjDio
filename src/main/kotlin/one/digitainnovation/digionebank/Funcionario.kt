package one.digitainnovation.digionebank

abstract class Funcionario(
     nome: String,
     cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    abstract fun calculoAuxilio():
}