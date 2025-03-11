fun main() {
    //2. Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
    // Declaração da variável
    val numero1: Int

    // Solicita ao usuário um número
    print("Digite um número: ")
    numero1 = readln().toInt()

    // Verifica se o número é positivo, negativo ou zero
    if (numero1 > 0) {
        println("Esse número é positivo.")
    } else if (numero1 < 0) {
        println("Esse número é negativo.")
    } else {
        println("Ele é zero.")
    }
}