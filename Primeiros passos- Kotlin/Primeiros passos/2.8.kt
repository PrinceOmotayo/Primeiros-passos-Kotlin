//2.8. Leia 4 números, aceitando apenas valores maiores que 0 e menores ou igual a 10. Calcule a média e:
fun main() {
    var pokemon = mutableListOf<Int>()
    var ctd: Int = 0
    var soma: Double = 0.0
    // Válidação de entrada
    while (ctd < 4) { //while + contador para limitar a repetição e a entrada de somente 4 valores na lista
        println("Digite um número:")
        var numVd = readln().toInt()

        while (numVd <= 0 || numVd > 10) { //while para validação dos valores > 0 e < 10
            println("Digite um número válido")
            numVd = readln().toInt()
        }
        ctd++ // <- Para aumentar o ctd quando um número for validado
        pokemon.add(numVd) // <- Para adicionar a lista após validação
        soma += numVd // acumula o número na soma
    }
    var media: Double = 0.0
    media = soma / 4
    if (media > 5) {
        println("Média final : $media \n Aprovado!")
    } else {
        println("Media final: $media \n Reprovado!Tente novamente.")
    }
}