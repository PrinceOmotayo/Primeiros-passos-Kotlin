//2.6. Leia 4 valores diferentes e informe apenas o primeiro, o último e o maior deles.
fun main (){
    println("Digite um número:")
    val num1 = readln().toDouble()
    println("Digite um número:")
    val num2 = readln().toDouble()
    println("Digite um número:")
    val num3 = readln().toDouble()
    println("Digite um número:")
    val num4 = readln().toDouble()
    val maior : Double

    if (num1 > num2 &&  num1 > num3 && num1 > num4) {
        maior = num1
    }

    else if (num2 > num1 && num2 > num3 && num2 > num4) {
        maior = num2
    }
    else if (num2 > num1 && num2 > num3 && num3 > num4) {
        maior = num3
    }
    else {
        maior = num4
    }
println("First: $num1 \n Last: $num4 \n Maior: $maior  ")
}