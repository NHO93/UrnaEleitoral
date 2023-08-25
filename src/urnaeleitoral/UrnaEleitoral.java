
package urnaeleitoral;

import java.util.Scanner;

public class UrnaEleitoral {

    /**
     * Programa de eleição
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int totalVotos = 0;
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int nulo0 = 0;
        int senha = 2024;

        System.out.println(" ESCOLHA A SUA CHAPA");
        
        System.out.println("===================");
        
             
        while (true) {

            System.out.println("1. Candidato 1");
            
            System.out.println("2. Candidato 2");
            
            System.out.println("3. Candidato 3");
            
            System.out.println("0. Nulo 0");
            
            System.out.println("Para Encerrar digete a senha: ");

            int escolha = scanner.nextInt();

            if (escolha == senha) {
                break;
            } else if (escolha >= 0 && escolha <= 3) {
                totalVotos++;
                switch (escolha) {
                    case 0:
                        nulo0++;
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
                        System.out.println("Escolha invalida. Tente novamente");
                        break;
                }
            } else {
                System.out.println("Escolha invalida. Tente novamente");

            }

        }
        System.out.println("\nu  Resultado");
        System.err.println("======================");

        System.out.println("Total de Votos Nulos: " + nulo0 + " votos");
        System.out.println("Total de Votos da Chapa 1: " + votosCandidato1 + " votos");
        System.out.println("Total de Votos da Chapa 2: " + votosCandidato2 + " votos");
        System.out.println("Total de Votos da Chapa 3: " + votosCandidato3 + " votos");
        System.out.println("Total de Votos: " + totalVotos);
        scanner.close();

    }

}
