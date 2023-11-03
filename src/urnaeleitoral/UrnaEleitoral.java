package urnaeleitoral;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class UrnaEleitoral {

    public static void main(String[] args) {
        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int nulo = 0;

        String senhaEncerrar = JOptionPane.showInputDialog(null, "Digite a senha para encerrar a votação:");
        String senhaResultado = JOptionPane.showInputDialog(null, "Digite a senha para exibir o resultado:");

        String[] candidatos = {"Candidato 1", "Candidato 2", "Candidato 3"};

        boolean votacaoIniciada = false;
        boolean votacaoEncerrada = false;

        while (true) {
            String input = JOptionPane.showInputDialog(null,
                    "Opções:\n\n1. Registrar mesário\n2. Iniciar votação\n3. Encerrar votação\n4. Votar\n5. Exibir resultado\n0. Sair\n");

            if (input.equals("1")) {
                String nomeMesario = JOptionPane.showInputDialog(null, "Nome do Mesário:");
                JOptionPane.showMessageDialog(null, "Mesário registrado com sucesso.");
            } else if (input.equals("2")) {
                if (!votacaoIniciada) {
                    JOptionPane.showMessageDialog(null, "Votação iniciada automaticamente.");
                    votacaoIniciada = true;
                } else {
                    JOptionPane.showMessageDialog(null, "A votação já foi iniciada.");
                }
            } else if (input.equals("3")) {
                if (votacaoIniciada) {
                    String senha = JOptionPane.showInputDialog(null, "Digite a senha para encerrar a votação:");
                    if (senha.equals(senhaEncerrar)) {
                        JOptionPane.showMessageDialog(null, "Votação encerrada.");
                        votacaoEncerrada = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta. A votação não foi encerrada.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A votação ainda não foi iniciada.");
                }
            } else if (input.equals("4") && votacaoIniciada && !votacaoEncerrada) {
                try {
                    int escolha = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Escolha um candidato:\n\n1. Candidato 1\n2. Candidato 2\n3. Candidato 3\n0. Voto nulo"));
                    if (escolha >= 0 && escolha <= candidatos.length) {
                        totalVotos++;
                        switch (escolha) {
                            case 0:
                                nulo++;
                                break;
                            case 1:
                                votosCandidato1++;
                                break;
                            case 2:
                                votosCandidato2++;
                                break;
                            case 3:
                                votosCandidato3++;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente");
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha inválida. Tente novamente");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
                }
            } else if (input.equals("5")) {
                if (votacaoEncerrada) {
                    String senha = JOptionPane.showInputDialog(null, "Digite a senha para exibir o resultado:");
                    if (senha.equals(senhaResultado)) {
                        String resultado = "Resultado:\n\n" +
                                "Total de Votos Nulos: " + nulo + " votos\n";
                        for (int i = 0; i < candidatos.length; i++) {
                            resultado += "Total de Votos de " + candidatos[i] + ": " + (i == 0 ? votosCandidato1 : (i == 1 ? votosCandidato2 : votosCandidato3)) + " votos\n";
                        }
                        resultado += "Total de Votos: " + totalVotos + " votos\n";

                        JOptionPane.showMessageDialog(null, resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta para exibir o resultado.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "A votação ainda não foi encerrada.");
                }
            } else if (input.equals("0")) {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Ação inválida. Verifique se a votação está iniciada ou se a ação é permitida.");
            }
        }
    }
}
