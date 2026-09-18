//1.2. Peça ao usuário que informe o nome e exiba a mensagem: Olá, [NomeDoUsuario].
fun main (){

    println("Digite o nome do usuário: ")
    var name_user = readln()
    println("Olá ${name_user.uppercase()}, tenha um dia incrivél pela frente!")
    println("$name_user tem ${name_user.length} letras.")

}