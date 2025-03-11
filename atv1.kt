fun main() {
    //1. Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.


    // Declaração das variáveis
    val numero1: Int
    val numero2: Int

    // Solicita ao usuário o primeiro número
    print("Digite o primeiro número: ")
    numero1 = readln().toInt()

    // Solicita ao usuário o segundo número
    print("Digite o segundo número: ")
    numero2 = readln().toInt()

    // Verifica qual número é maior e exibe o resultado
    if (numero1 >= numero2) {
        println("O número $numero1 é maior ou igual ao número $numero2.")
    } else {
        println("O número $numero2 é maior que o número $numero1.")
    }
}