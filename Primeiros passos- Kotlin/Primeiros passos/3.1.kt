//3.1. Crie uma bomba-relógio com contagem regressiva de 30 até 0 e, ao final, escreva EXPLOSÃO.
fun main() {
    println("Bem vindo a TimerBomb! \n Deseja iniciar a partir de qual número?")
    var ctd = readln().toInt()
    while (ctd > 0) {
        println("Detonação em $ctd segundos...")
        ctd--
    }
    println("BOOM!")
}