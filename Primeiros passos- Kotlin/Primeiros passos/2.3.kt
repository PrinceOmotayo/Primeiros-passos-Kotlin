//2.3. Leia 3 valores diferentes e mostre o maior.
fun main (){
    println("Digite um valor:")
    var num1 = readln()
    println("Digite o segundo valor:")
    var num2 = readln()
    println("Digite o terceiro valor:")
    var num3 = readln()

    if (num1 > num2 &&  num1 > num3) {
        println("$num1 é o maior")
    }
    else if (num2 > num1 && num2 > num3) {
        println("$num2 é o maior")
    }
    else println("$num3 é o maior")
}