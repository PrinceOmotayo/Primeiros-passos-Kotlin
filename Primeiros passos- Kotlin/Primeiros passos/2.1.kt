//2.1. Leia dois números e mostre o maior deles.
fun main (){
    println("Digite um número:")
    var num1 = readln().toInt()
    println("Digite o segundo número:")
    var num2 = readln().toInt()

    if (num1 > num2) {
        println("$num1 é maior que $num2 .")
    }
    else println("$num2 é maior que $num1 .")
}
