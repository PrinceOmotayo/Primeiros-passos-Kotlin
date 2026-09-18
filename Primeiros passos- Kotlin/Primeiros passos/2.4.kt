
//2.4. Leia 3 valores diferentes e mostre a soma dos 2 maiores.
fun main (){
    println("Digite um valor:")
    var num1 = readln().toInt()
    println("Digite o segundo valor:")
    var num2 = readln().toInt()
    println("Digite o terceiro valor:")
    var num3 = readln().toInt()

    var menor: Int
    var smma: Int

    if (num1 < num2 &&  num1 < num3) {
         menor = num1
         smma = num2 + num3
        }

    else if (num2 < num1 && num2 < num3) {
        menor = num2
        smma = num1 + num3
        }
    else {
        menor = num3
        smma = num1 + num2
    }
    println("A Soma dos maiores é :$smma \n O menor número é : $menor")
}
