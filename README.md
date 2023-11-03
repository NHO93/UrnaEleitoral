# UrnaEleitoral

SOBRE: Primeiro programa que criei após alguns meses de estudos.

Claro, vou explicar o código em etapas:

1. **Configuração Inicial e Variáveis**:
   - O código começa importando as classes necessárias do pacote `javax.swing`, que são usadas para criar interfaces gráficas em Java.
   - Em seguida, o código define variáveis para controlar o total de votos, os votos para cada candidato, votos nulos e variáveis de senha para encerrar a votação e exibir o resultado. Também é definido um array de `String` chamado `candidatos` para armazenar os nomes dos candidatos.
   - Duas variáveis booleanas, `votacaoIniciada` e `votacaoEncerrada`, são usadas para controlar o estado da votação.

2. **Loop Principal**:
   - O código entra em um loop while que permite ao programa continuar executando até que o usuário escolha sair (opção "0").

3. **Opções do Menu**:
   - O programa exibe um menu com várias opções, que são:
     - "Registrar mesário" (opção "1"): Permite ao usuário inserir o nome do mesário, mas não faz nada mais além de exibir uma mensagem de confirmação.
     - "Iniciar votação" (opção "2"): Se a votação ainda não foi iniciada (`votacaoIniciada` é `false`), inicia automaticamente (`votacaoIniciada` é definida como `true`).
     - "Encerrar votação" (opção "3"): Se a votação foi iniciada e ainda não foi encerrada (`votacaoEncerrada` é `false`), solicita a senha para encerrar. Se a senha estiver correta, a votação é encerrada (`votacaoEncerrada` é definida como `true`).
     - "Votar" (opção "4"): Permite aos eleitores votar em um candidato. A votação só é permitida se a votação foi iniciada e ainda não foi encerrada. Os votos são contados para cada candidato, votos nulos são registrados e o total de votos é incrementado.
     - "Exibir resultado" (opção "5"): Exibe o resultado da votação, mas apenas se a votação foi encerrada e a senha para exibir o resultado estiver correta.
     - "Sair" (opção "0"): Finaliza o programa.

4. **Tratamento de Senhas**:
   - O código lida com senhas para encerrar a votação e exibir o resultado, verificando se as senhas inseridas pelo usuário coincidem com as senhas definidas no início do programa.

5. **Apresentação dos Resultados**:
   - Quando o usuário escolhe a opção "Exibir resultado," o código calcula e apresenta o resultado da votação. Isso inclui o total de votos, o número de votos para cada candidato e o número de votos nulos.

6. **Restrições**:
   - O código verifica se as ações do usuário são válidas, com base no estado da votação e nas opções escolhidas. Se uma ação não for válida, o código exibe uma mensagem de erro.

No geral, o código permite que um mesário registre seu nome, inicie e encerre a votação com senhas, registre votos e, após o encerramento, exiba os resultados. É importante observar que este código é simplificado e não lida com muitas das complexidades do processo eleitoral do mundo real, mas serve como um exemplo básico de como implementar um sistema de votação simples em Java.
