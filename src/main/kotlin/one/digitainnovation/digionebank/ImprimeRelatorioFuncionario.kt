package one.digitainnovation.digionebank

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}