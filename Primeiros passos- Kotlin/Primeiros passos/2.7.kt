//2.7. Leia 6 números. Some apenas os valores menores que 72. Exiba a soma e todos os valores informados.
fun main() {
    println("Digite um número:")
    val num1 = readln().toInt()
    println("Digite um número:")
    val num2 = readln().toInt()
    println("Digite um número:")
    val num3 = readln().toInt()
    println("Digite um número:")
    val num4 = readln().toInt()
    println("Digite um número:")
    val num5 = readln().toInt()
    println("Digite um número:")
    val num6 = readln().toInt()
    var soma: Int = 0
    var ctd = 0
    var pokemon = listOf<Int>(num1, num2, num3, num4, num5, num6)
    while (ctd < 6) {
        println(pokemon[ctd])
        if (pokemon[ctd] < 72) {
            soma += pokemon[ctd]
        }
        ctd++
    }
    println("Resultado da soma dos menores que 72: $soma")
}