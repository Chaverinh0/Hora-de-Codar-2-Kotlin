fun main() {

    //11. Uma micro calculadora
    //Escreva um programa para ler 2 valores inteiros informados pelo usuário e uma das seguintes operações a serem executadas (codificada da seguinte forma: 1. Adição, 2. Subtração, 3. Divisão, 4. Multiplicação).
    //O programa deve calcular e escrever o resultado dessa operação sobre os dois valores lidos.
    //
    //Observação: Considere que só serão lidos os valores 1, 2, 3 ou 4 para as operações


    // Declaração das variáveis
    var valor1: Int
    var valor2: Int
    var operacao: Int
    var resultado: Double

    // Solicita os valores e a operação
    print("Digite o primeiro valor: ")
    valor1 = readLine()!!.toInt()
    print("Digite o segundo valor: ")
    valor2 = readLine()!!.toInt()
    print("Digite a operação (1: Adição, 2: Subtração, 3: Divisão, 4: Multiplicação): ")
    operacao = readLine()!!.toInt()

    // Realiza a operação selecionada
    when (operacao) {
        1 -> {
            resultado = (valor1 + valor2).toDouble()
            println("Resultado da adição: $resultado")
        }
        2 -> {
            resultado = (valor1 - valor2).toDouble()
            println("Resultado da subtração: $resultado")
        }
        3 -> {
            if (valor2 != 0) {
                resultado = valor1.toDouble() / valor2.toDouble()
                println("Resultado da divisão: $resultado")
            } else {
                println("Erro: Divisão por zero!")
            }
        }
        4 -> {
            resultado = (valor1 * valor2).toDouble()
            println("Resultado da multiplicação: $resultado")
        }
        else -> {
            println("Operação inválida! Digite um número entre 1 e 4.")
        }
    }
}
