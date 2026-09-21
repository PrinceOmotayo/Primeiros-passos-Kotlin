//3.2. Leia dois valores. Enquanto o segundo valor for menor ou igual a zero,
// peça novamente esse mesmo valor. Ao final, mostre a divisão do primeiro pelo segundo.
fun main() {
    println("Digite um número:")
    var num1 = readln().toInt()
    println("Digite o segundo número:")
    var num2 = readln().toInt()
    while (num2 <= 0) {
        println("Digite o segundo número:")
        num2 = readln().toInt()
    }
    var dvs = num1 / num2
    println("Divisão de $num1 por $num2 é : $dvs")
}