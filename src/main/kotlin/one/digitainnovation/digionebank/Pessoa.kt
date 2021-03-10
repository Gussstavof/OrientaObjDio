package one.digitainnovation.digionebank

class Pessoa {
    var nome: String = "Gustavo"

    var cpf: String = "000.000.000-00"
    private set

    constructor()

    fun pessoainfo() = "$nome e $cpf"




}

fun main(){
    val Gustavo = Pessoa()
    println(Gustavo.pessoainfo())



}