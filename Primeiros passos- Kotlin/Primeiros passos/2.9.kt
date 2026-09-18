//2.9. Leia o ano de nascimento e informe se a pessoa pode votar no ano atual (sem considerar o mês).
fun main(){
    println("Digite o seu ano de nascimento:")
    val nascimento = readln().toInt()
    val atual = 2026
    val idade = atual - nascimento
    if (idade >=18){
        println("Você tem ${idade} anos. Você pode votar.")
    }
    else{
        println("Você tem ${idade}anos. Você não pode votar")
    }
}