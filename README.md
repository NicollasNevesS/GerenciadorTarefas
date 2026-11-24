# Gerenciador de Tarefas

## Identificação

- **Aluno:** Nicollas Neves
- **Turma:** 2° DS
- **Professor:** Andrei
- **Disciplina:** DSI
- **Tema:** Opção C — Organização de Tarefas de uma Feira Técnica

## Sobre o projeto

O Gerenciador de Tarefas é um sistema desenvolvido em Java com o objetivo de auxiliar na organização das atividades de uma feira técnica.

O sistema permite cadastrar, consultar, listar e concluir tarefas, facilitando o acompanhamento das atividades pendentes e concluídas por meio de um menu interativo no console.

## Tecnologias utilizadas

- Java 21
- IntelliJ IDEA
- Git
- GitHub

## Funcionalidades

- Cadastrar tarefas com código, descrição, responsável e prioridade.
- Listar todas as tarefas cadastradas.
- Buscar tarefas pelo código.
- Marcar tarefas como concluídas.
- Listar somente as tarefas pendentes.
- Exibir um relatório com o total de tarefas pendentes e concluídas.
- Encerrar o programa.

## Validações

- Impede o cadastro de códigos repetidos.
- Não permite descrições vazias.
- Não permite nomes de responsáveis vazios.
- Aceita apenas as prioridades baixa, média ou alta.
- Define novas tarefas como pendentes.
- Impede a conclusão de tarefas já concluídas.
- Informa quando uma tarefa não é encontrada.
- Impede entradas não numéricas nos campos de código e menu.
- Informa quando uma opção do menu é inválida.

## Estrutura do projeto

- `Main.java`: responsável pelo menu e pela interação com o usuário.
- `Tarefa.java`: responsável pelos atributos e métodos de cada tarefa.
- `GerenciadorTarefas.java`: responsável pelo armazenamento, operações e validações das tarefas.

## Como executar

1. Baixe ou clone este repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Certifique-se de que o JDK 21 esteja instalado e configurado.
4. Abra o arquivo `Main.java`, localizado na pasta `src`.
5. Execute o método `main`.
6. Utilize o menu apresentado no console.

## Registro dos testes

Os testes foram realizados manualmente pelo console do IntelliJ IDEA durante o desenvolvimento do sistema.

| Nº | Teste | Dados utilizados | Resultado esperado | Resultado obtido |
|---|---|---|---|---|
| 1 | Cadastro válido | Código 101, Preparar Cartazes, Ana, alta | Cadastrar e listar a tarefa | Tarefa cadastrada e listada corretamente |
| 2 | Código repetido | Código 101 cadastrado novamente | Recusar o cadastro duplicado | Código já cadastrado |
| 3 | Informação inválida | Descrição vazia, responsável vazio e prioridade urgente | Recusar os cadastros inválidos | Todos os cadastros inválidos foram recusados |
| 4 | Busca existente | Código 101 | Exibir os dados da tarefa | Tarefa encontrada e exibida |
| 5 | Busca inexistente | Código 102 não cadastrado | Informar que a tarefa não existe | Tarefa não encontrada |
| 6 | Operação principal | Concluir a tarefa 101 | Alterar a situação para concluída | Tarefa concluída com sucesso |
| 7 | Operação não permitida | Concluir novamente a tarefa 101 | Recusar a operação | Tarefa já concluída |
| 8 | Lista vazia | Listar sem tarefas cadastradas | Informar que não existem tarefas | Nenhuma tarefa cadastrada |
| 9 | Opção inválida | Digitar 10 no menu | Exibir erro e retornar ao menu | Opção inválida e menu exibido novamente |

### Testes adicionais

| Teste | Resultado esperado | Resultado obtido |
|---|---|---|
| Digitar letras no menu | Solicitar um número inteiro | Funcionou corretamente |
| Digitar letras no código | Solicitar um número inteiro | Funcionou corretamente |
| Listar tarefas pendentes | Exibir apenas as tarefas 102 e 103 | Funcionou corretamente |
| Exibir relatório | 3 tarefas, 2 pendentes e 1 concluída | Funcionou corretamente |
| Verificar cadastros inválidos | Nenhuma tarefa armazenada | Funcionou corretamente |
| Encerrar o programa | Finalizar sem erros | Exit code 0 |

**Resultado final: todos os testes obrigatórios foram aprovados.**

## Limitações

Os dados são armazenados temporariamente em um ArrayList durante a execução do programa. Ao encerrar o sistema, as tarefas cadastradas são perdidas.

O sistema funciona exclusivamente pelo console, sem interface gráfica ou banco de dados, conforme permitido na proposta da atividade.

## Uso de inteligência artificial

Durante o desenvolvimento do projeto, utilizei o ChatGPT como ferramenta de apoio para compreender conceitos de Java, auxiliar na implementação do código, esclarecer dúvidas e corrigir erros.

Cada funcionalidade foi implementada e testada no IntelliJ IDEA durante o desenvolvimento. Também utilizei a inteligência artificial para auxiliar na elaboração, formatação e organização do README.md.

## Status do projeto

Concluído, com todas as funcionalidades obrigatórias implementadas e testadas.
