fun fibonacci(num: Int): Boolean {
    var a = 0
    var b = 1

    while (b < num) {
        val temp = a + b
        a = b
        b = temp
    }

    return b == num || num == 0
}

fun main() {
    print("Digite um número: ")
    val input = readLine()?.toIntOrNull()

    if (input != null) {
        if (fibonacci(input)) {
            println("$input faz parte da sequência de Fibonacci.")
        } else {
            println("$input NÃO faz parte da sequência de Fibonacci.")
        }
    } else {
        println("Entrada inválida.")
    }
}
