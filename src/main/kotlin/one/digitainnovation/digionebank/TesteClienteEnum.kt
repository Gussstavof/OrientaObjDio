package one.digitainnovation.digionebank

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    val pf = ClienteTipo.pf
    println("${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.pj
    println("${pj.name} - ${pj.descricao}")
}