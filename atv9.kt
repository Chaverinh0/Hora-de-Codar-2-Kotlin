fun main() {
    //9. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).
    // Declaração das variáveis
    var anoNascimento: Int
    val anoAtual = 2025
    var idade: Int

    // Solicita o ano de nascimento
    print("Digite o ano de nascimento: ")
    anoNascimento = readLine()!!.toInt()

    // Calcula a idade
    idade = anoAtual - anoNascimento

    // Verifica se a pessoa pode votar
    if (idade >= 16) {
        println("Você tem $idade anos e pode votar este ano!")
    } else {
        println("Você tem $idade anos e ainda não pode votar este ano.")
    }
}
