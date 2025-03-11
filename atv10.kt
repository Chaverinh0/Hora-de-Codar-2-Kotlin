fun main() {
    //10. Tendo como entrada a altura e o gênero designado ao nascer (codificado da seguinte forma: 1: feminino - 2: masculino - ) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas.
    // Declaração das variáveis
    var altura: Double
    var pesoIdeal: Double
    var genero: Int

    // Solicita a altura e o gênero
    print("Digite a altura (em metros): ")
    altura = readLine()!!.toDouble()
    print("Digite o gênero (1 para feminino, 2 para masculino): ")
    genero = readLine()!!.toInt()

    // Calcula o peso ideal com base no gênero
    if (genero == 1) {
        pesoIdeal = 62.1 * altura - 44.7
        println("O peso ideal para uma mulher com ${altura}m de altura é: ${pesoIdeal} kg")
    } else if (genero == 2) {
        pesoIdeal = 72.7 * altura - 58
        println("O peso ideal para um homem com ${altura}m de altura é: ${pesoIdeal} kg")
    } else {
        println("Gênero inválido! Digite 1 para feminino ou 2 para masculino.")
    }
}
