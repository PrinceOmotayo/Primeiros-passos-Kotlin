//3.7. Leia um valor N (N > 0) e imprima todos os inteiros de 1 até N.
fun main() {
    var nums: Int = 1
    print("Digite um número: ")
    var num = readln().toInt()
    while (num < 1) {             //validação de entrada
        print("Digite um número válido:")
        num = readln().toInt()
    }
    while (num >= nums) {
        println("$nums")
        nums++
    }
}