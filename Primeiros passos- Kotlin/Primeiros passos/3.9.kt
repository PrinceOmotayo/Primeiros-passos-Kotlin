//3.9. Leia 10 valores e informe quantos estão no intervalo de 24 a 42 (inclusive) e quantos estão fora.
fun main() {
    var ctd = 0
    var numsf = mutableListOf<Int>()
    var numsd = mutableListOf<Int>()
    while (ctd < 10) { //Limitador de respostas
        println("Digite um número: ")
        ctd++
        var input = readln().toInt()
        if (input > 24 && input < 42) {
            numsd.add(input)
        } else {
            numsf.add(input)
        }
    }
    println("Números dentro do intervalo: ${numsd.size} \nSão eles: $numsd")
    println("Números fora do intervalo: ${numsf.size} \nSão eles: $numsf")
}