fun main() {
    val nomes_estudantes = mutableListOf<String>()
    var nome_estudante: String

    println("Digite o nome do aluno (digite PARE quando quiser parar)")
    while (true) {
        nome_estudante = readln()
        if (nome_estudante == "PARE") {
            break
        }
        nomes_estudantes.add(nome_estudante)
    }

    println("O número de alunos é: ${nomes_estudantes.size}")
    println("Nomes dos alunos: $nomes_estudantes")
}