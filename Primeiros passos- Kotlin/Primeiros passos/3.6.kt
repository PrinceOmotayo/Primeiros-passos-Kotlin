//3.6. Leia 6 notas válidas (de 0 a 10), calcule e exiba a média simples.
fun main() {
    var nv = mutableListOf<Double>()
    var ctd = 0
    var nums = 0
    var notas: Double = 0.0
    var numvd: Double = 0.0
    var soma: Double = 0.0
    while (ctd < 6) {
        println("Digite uma nota:")
        notas = readln().toDouble()
        while (notas < 0 || notas > 10) { //while para validação dos valores > 0 e < 10
            println("Digite um número válido")
            notas = readln().toDouble()
        }
        if (notas >= 0 && notas <= 10) {
            nv.add(notas)
            soma += notas
            ctd++
        }
    }
    var media: Double = soma / ctd
    println("Média: $media")
}