fun main() {
    val planetas = arrayOf("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno")
    println("Digite o nome de um planeta: ")
    val nome_planeta = readln()
    if (planetas.contains(nome_planeta)) {
        print("O planeta existe no sistema solar!")
    } else {
        print("O planeta não existe no sistema solar.")
    }
}