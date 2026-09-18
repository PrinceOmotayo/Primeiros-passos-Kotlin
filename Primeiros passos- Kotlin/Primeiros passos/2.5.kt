//2.5. Leia 6 valores, exiba todos e calcule a média aritmética.
fun  main() {
    println("Digite um número:")
    val num1 = readln().toDouble()
    println("Digite um número:")
    val num2 = readln().toDouble()
    println("Digite um número:")
    val num3 = readln().toDouble()
    println("Digite um número:")
    val num4 = readln().toDouble()
    println("Digite um número:")
    val num5 = readln().toDouble()
    println("Digite um número:")
    val num6 = readln().toDouble()
    val media: Double = ((num6 + num5 + num4 + num3 + num2 + num1) / 6)
    println("$num6 $num5 $num4 $num3 $num2 $num1")
    println(" A média é : $media")
}
