// 2.2. Leia um valor e diga se ele é positivo, negativo ou zero.
fun main(){
    println("Digite um número:")
    var num1 = readln().toInt()

    if (num1 > 0  ) {
        println("$num1 é positivo")
    }
    else if (num1 == 0) {
        println("$num1 é zero")
    }
    else println("$num1 é negativo")
}

