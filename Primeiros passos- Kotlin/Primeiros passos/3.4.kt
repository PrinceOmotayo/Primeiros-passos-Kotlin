//3.4. Leia dois inteiros (sendo o primeiro menor que o segundo) e
// calcule a média desses números e de todos os inteiros entre eles.
fun main() {
    println("Digite um número:")
    var num1 = readln().toInt()
    println("Digite o segundo número:")
    var num2 = readln().toInt()
    while (num1 >= num2) {
        println("Digite um número menor que o segundo:")
        num1 = readln().toInt()
    }
    var soma = 0
    var nums = 0
    for (i in num1..num2) {
        soma += i
        nums++
    }
    var media = soma / nums
    println("Soma total: $soma \nQuantidade de números: $nums \nMédia: $media")
}