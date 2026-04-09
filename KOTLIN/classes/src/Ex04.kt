/*
Trabalho 1
nome: Ana Carolina Torres de Moura
4 - Faça um Programa que verifique se uma letra digitada é "F" ou "M".
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

fun main () {
    print("Digite uma letra: ")
    var letra = readLine()!!.uppercase()

    if (letra == "F") {
        print("Feminino")
    } else if (letra == "M"){
        print("Masculino")
    } else {
        print("Digite uma letra válida")
    }
}



