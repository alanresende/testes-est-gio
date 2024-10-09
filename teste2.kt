fun main() {
    print("Digite uma frase: ")
    val input = readLine()

    if (input != null) {
        val count = input.count { it == 'A' || it == 'a' }
        
        if (count > 0) {
            println("A letra 'A' aparece $count vezes.")
        } else {
            println("A letra 'A' não aparece na frase.")
        }
    } else {
        println("Entrada inválida.")
    }
}
