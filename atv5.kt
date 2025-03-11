fun main() {
    //5.  Faça um programa que leia 6 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
    // Declaração das variáveis
    val valores = DoubleArray(6) // Array para armazenar os 6 valores
    var soma = 0.0 // Variável para armazenar a soma dos valores
    var media: Double // Variável para armazenar a média

    // Leitura dos valores informados pelo usuário
    for (i in 0 until 6) {
        print("Digite o valor ${i + 1}: ")
        valores[i] = readln().toDouble()
        soma += valores[i] // Acumula a soma dos valores
    }

    // Cálculo da média aritmética
    media = soma / 6

    // Exibição dos valores informados
    print("Valores informados: ")
    for (i in 0 until 6) {
        print("${valores[i]} ")
    }

    // Exibição da média aritmética
    println("\nA média aritmética é: $media")
}