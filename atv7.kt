fun main() {
    //7. Faça um programa que leia 6 números que o usuário vai informar. Todos os números lidos com valor inferior a 72 devem ser somados. Escreva o valor final da soma efetuada e também todos valores que o usuário informou.
    // Declaração das variáveis
    val valores = DoubleArray(6) // Array para armazenar os 6 valores
    var soma = 0.0 // Variável para armazenar a soma dos valores inferiores a 72

    // Leitura dos valores informados pelo usuário
    for (i in 0 until 6) {
        print("Digite o valor ${i + 1}: ")
        valores[i] = readln().toDouble()
    }

    // Soma dos valores inferiores a 72
    for (i in 0 until 6) {
        if (valores[i] < 72) {
            soma += valores[i]
        }
    }

    // Exibição dos valores informados
    print("Valores informados: ")
    for (i in 0 until 6) {
        print("${valores[i]} ")
    }

    // Exibição da soma dos valores inferiores a 72
    println("\nA soma dos valores inferiores a 72 é: $soma")
}