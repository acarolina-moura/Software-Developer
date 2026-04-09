import java.util.Scanner;


public class JogoForca {
// métodos e atributos para minha classe

    // ATRIBUTOS OBRIGATÓRIOS INDICADOS:

    String palavraSecreta;
    char palavraRevelada; // palavra com as letras descobertas
    List<Character> letrasTentadas; // letras já tentadas
    int tentativasRestantes; // número de erros permitidos (6)
    boolean jogoTerminado; // estado do jogo
    boolean jogadorVenceu; //resultado final
    gestorPalavras(); // GestorPalavras - gestor de palavras
    String horaInicio; //hora de início do jogo


    // (2) Métodos Getters e Setters

    inicializarJogo() // Escolhe palavra e inicializa arrays
    processarTentativa(char letra) // Processa letra tentada
    verificarLetra(char letra) // Verifica se letra existe na palavra
    verificarVitoria() // Verifica se palavra foi descoberta
    verificarDerrota() // Verifica se tentativas acabaram
    mostrarEstado() // Mostra palavra parcial e tentativas
    mostrarForca() // Desenha estado da forca
    revelarLetras(char letra) // Revela todas as ocorrências da letra
    guardarEstatistica() // Grava resultado no ficheiro estatisticas.txt dentro de um diretório próprio chamado Estatísticas_Jogo
    obterLetrasCorretas() // Obtêm as letras corretas da palavra
    obterLetrasErradas() // Obtêm as letras erradas da palavra

    public static void main(String[] args) {

    }
}
