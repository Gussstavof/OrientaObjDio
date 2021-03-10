package one.digitainnovation.digionebank

class Pessoa {
    var nome: String = "Gustavo"

    var cpf: String = "000.000.000-00"
    private set


    /*inner class Endereco{
        var rua: String = "Rua teste"
    }*/

}

fun main(){
    val Gustavo = Pessoa()


    println(Gustavo.nome)
    println(Gustavo.cpf)
    println(Gustavo)

    //println(Gustavo.Endereco().rua)
}