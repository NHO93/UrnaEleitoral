package urnaeleitoral;

import javax.swing.JOptionPane;

public class UrnaEleitoral {

 
   public static void main(String[] args) {

       int totalVotos = 0;
       int votosCandidato1 = 0;
       int votosCandidato2 = 0;
       int votosCandidato3 = 0;
       int nulo = 0;

    String senha = JOptionPane.showInputDialog(null, "Digite a senha e NÃO ESQUEÇA");

    while (senha.length()<= 0){ senha = JOptionPane.showInputDialog(null, "Digite a Senha OBRIGATÓRIA e NÂO ESQUEÇA");}
   
    while (true) {
        String input = JOptionPane.showInputDialog(null,
                "Escolha um canditado:\n\n1. Candidato 1\n2. Candidato 2\n3. Candidato 3\n0. Voto nulo\n Insira a senha para encerrar a votação");
        if (input.equals(senha)) {
            break;
        } else {
            try {
                int escolha = Integer.parseInt(input);
                if (escolha >= 0 && escolha <= 3) {
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
        }
    }

    String resultado = "Resultado:\n\n" +
            "Total de Votos Nulos: " + nulo + " votos\n" +
            "Total de Votos da Chapa 1: " + votosCandidato1 + " votos\n" +
            "Total de Votos da Chapa 2: " + votosCandidato2 + " votos\n" +
            "Total de Votos da Chapa 3: " + votosCandidato3 + " votos\n" +
            "Total de Votos: " + totalVotos + " votos\n";

    JOptionPane.showMessageDialog(null,resultado);
    }

}
