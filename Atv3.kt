fun main() {
    //3. Faça um programa para ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.
    // Declaração das variáveis
    val numero1: Int
    val numero2: Int
    val numero3: Int

    // Solicita ao usuário o primeiro número
    print("Digite o primeiro número: ")
    numero1 = readln().toInt()

    // Solicita ao usuário o segundo número
    print("Digite o segundo número, sem repetir os valores já inseridos: ")
    numero2 = readln().toInt()

    // Solicita ao usuário o terceiro número
    print("Digite o terceiro número, sem repetir os valores já inseridos: ")
    numero3 = readln().toInt()

    // Verifica qual é o maior número
    if (numero1 > numero2 && numero1 > numero3) {
        println("O número $numero1 é o maior deles.")
    } else if (numero2 > numero1 && numero2 > numero3) {
        println("O número $numero2 é o maior deles.")
    } else if (numero3 > numero1 && numero3 > numero2) {
        println("O número $numero3 é o maior deles.")
    }
}