fun main() {
    //6. Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o último e o maior de todos eles (considere que todos os números informados serão diferentes)
    // Declaração das variáveis
    val valores = DoubleArray(4) // Array para armazenar os 4 valores
    var maior: Double // Variável para armazenar o maior valor

    // Leitura dos valores informados pelo usuário
    for (i in 0 until 4) {
        print("Digite o valor ${i + 1}: ")
        valores[i] = readln().toDouble()
    }

    // Inicializa a variável maior com o primeiro valor
    maior = valores[0]

    // Encontra o maior valor
    for (i in 1 until 4) {
        if (valores[i] > maior) {
            maior = valores[i]
        }
    }

    // Exibição do primeiro, último e maior valor
    println("O primeiro valor informado é: ${valores[0]}")
    println("O último valor informado é: ${valores[3]}")
    println("O maior valor informado é: $maior")
}