//3.5. Leia 2 notas de um aluno, calcule a média final e considere aprovação com nota 9,5.
// Em seguida, pergunte: Calcular a média de outro aluno? (S/N).
// Se a resposta for S, repita; caso contrário, encerre e mostre a quantidade de alunos aprovados.
fun main() {
    println("Digite a primeira nota:")
    var n1 = readln().toDouble()
    println("Digite a segunda nota:")
    var n2 = readln().toDouble()
    var soma = n1 + n2
    var media: Double = soma / 2
    var aprovados = 0
    if (media >= 9.5) {
        println("Aprovado!")
        aprovados++
    }
    println("Calcular média do próximo aluno? S/N")
    var opcao = readln().uppercase()
    while (opcao == "S") {
        println("Digite a primeira nota:")
        n1 = readln().toDouble()
        println("Digite a segunda nota:")
        n2 = readln().toDouble()
        soma = n1 + n2
        media = soma/2
        if (media >= 9.5) {
            println("Aprovado!")
            aprovados++
        }
        println("Calcular média do próximo aluno? S/N")
        opcao = readln().uppercase()
    }
    println("Alunos aprovados: $aprovados ")
}