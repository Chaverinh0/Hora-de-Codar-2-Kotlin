fun main() {
    //4. Faça um programa que leia 3 valores informados pelo usuário (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.
    // Declaração das variáveis
    val numero1: Int
    val numero2: Int
    val numero3: Int
    var maior: Int
    var segundomaior: Int
    var soma: Int

    // Solicita ao usuário o primeiro número
    print("Digite o primeiro número: ")
    numero1 = readln().toInt()

    // Solicita ao usuário o segundo número
    print("Digite o segundo número, sem repetir os valores já inseridos: ")
    numero2 = readln().toInt()

    // Solicita ao usuário o terceiro número
    print("Digite o terceiro número, sem repetir os valores já inseridos: ")
    numero3 = readln().toInt()

    // Encontrar o maior número
    if (numero1 > numero2 && numero1 > numero3) {
        maior = numero1
        if (numero2 > numero3) {
            segundomaior = numero2
        } else {
            segundomaior = numero3
        }
    } else if (numero2 > numero1 && numero2 > numero3) {
        maior = numero2
        if (numero1 > numero3) {
            segundomaior = numero1
        } else {
            segundomaior = numero3
        }
    } else {
        maior = numero3
        if (numero1 > numero2) {
            segundomaior = numero1
        } else {
            segundomaior = numero2
        }
    }

    // Calcula a soma dos dois maiores números
    soma = maior + segundomaior

    // Exibe o resultado
    println("A soma dos dois maiores números é: $soma")
}