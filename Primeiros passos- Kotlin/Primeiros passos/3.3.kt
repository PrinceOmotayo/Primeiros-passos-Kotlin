//3.3. Calcule e exiba a média aritmética dos números inteiros de 15 a 100 (inclusive).
fun main() {
    var soma: Int = 0
    var nums: Int = 0
    for (i in 15..100) {
        soma += i
        nums++
    }
    var media = soma / nums
    println("Soma total: $soma \nQuantidade de números: $nums \nMédia: $media")
}