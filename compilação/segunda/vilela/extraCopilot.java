
    import java.time.LocalTime;
import java.time.Duration;

public class extraCopilot {
    public static void main(String[] args) {
        // Obtém a hora atual
        LocalTime agora = LocalTime.now();

        // Cria um objeto LocalTime para representar o início do dia (00:00)
        LocalTime inicioDoDia = LocalTime.of(0, 0);

        // Calcula a diferença entre a hora atual e o início do dia
        Duration duracao = Duration.between(inicioDoDia, agora);

        // Obtém o tempo decorrido em horas e minutos
        long horas = duracao.toHours();
        long minutos = duracao.toMinutes() % 60;

        // Exibe o resultado
        System.out.println("Tempo decorrido desde o início do dia: " + horas + " horas e " + minutos + " minutos.");
    }
}

