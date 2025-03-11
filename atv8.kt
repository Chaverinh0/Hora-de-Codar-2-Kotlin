fun main() {
    //8. Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem "Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"
    // Declaração das variáveis
    val valores = DoubleArray(4)
    var soma = 0.0
    var media: Double
    var valoresValidos = true

    // Leitura dos valores informados pelo usuário
    for (i in 0..3) {
        print("Digite o valor ${i + 1} (entre 0 e 10): ")
        valores[i] = readLine()!!.toDouble()

        // Verifica se o valor está dentro do intervalo permitido
        if (valores[i] <= 0 || valores[i] >= 10) {
            valoresValidos = false
        } else {
            soma += valores[i]
        }
    }

    // Cálculo da média e exibição das mensagens
    if (valoresValidos) {
        media = soma / 4
        println("A média dos valores é: $media")

        if (media > 5) {
            println("Você passou no teste!")
        } else {
            println("Tente novamente.")
        }
    } else {
        println("Valores inválidos! Todos os números devem ser maiores que 0 e menores que 10.")
    }
}
