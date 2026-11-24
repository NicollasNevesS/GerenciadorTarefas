import java.util.ArrayList;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Tarefa buscarTarefa(int codigo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getCodigo() == codigo) {
                return tarefa;
            }
        }

        return null;
    }

    public void cadastrarTarefa(int codigo, String descricao, String responsavel, String prioridade) {

        if (buscarTarefa(codigo) != null) {
            System.out.println("Erro: código já cadastrado!");
            return;
        }

        if (descricao.trim().isEmpty()) {
            System.out.println("Erro: a descrição não pode estar vazia!");
            return;
        }

        if (responsavel.trim().isEmpty()) {
            System.out.println("Erro: o responsável não pode estar vazio!");
            return;
        }

        prioridade = prioridade.trim().toLowerCase();

        if (!prioridade.equals("baixa") && !prioridade.equals("média") && !prioridade.equals("alta")) {
            System.out.println("Erro: prioridade inválida!");
            return;
        }

        Tarefa tarefa = new Tarefa(codigo, descricao, responsavel, prioridade);

        tarefas.add(tarefa);

        System.out.println("Tarefa cadastrada com sucesso!");
    }

    public void listarTarefas() {

        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada!");
            return;
        }

        for (Tarefa tarefa : tarefas) {
            exibirTarefa(tarefa);
        }
    }

    public void exibirTarefa(Tarefa tarefa) {
        System.out.println("----------------------------");
        System.out.println("Código: " + tarefa.getCodigo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        System.out.println("Responsável: " + tarefa.getResponsavel());
        System.out.println("Prioridade: " + tarefa.getPrioridade());
        System.out.println("Situação: " + (tarefa.isConcluida() ? "Concluída" : "Pendente"));
        System.out.println("----------------------------");
    }

    public void consultarTarefa(int codigo) {
        Tarefa tarefa = buscarTarefa(codigo);

        if (tarefa == null) {
            System.out.println("Erro: tarefa não encontrada!");
            return;
        }

        exibirTarefa(tarefa);
    }

    public void concluirTarefa(int codigo) {
        Tarefa tarefa = buscarTarefa(codigo);

        if (tarefa == null) {
            System.out.println("Erro: tarefa não encontrada!");
            return;
        }

        if (tarefa.isConcluida()) {
            System.out.println("Erro: esta tarefa já está concluída!");
            return;
        }

        tarefa.concluir();

        System.out.println("Tarefa concluída com sucesso!");
    }

    public void listarPendentes() {

        boolean encontrouPendente = false;

        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                exibirTarefa(tarefa);
                encontrouPendente = true;
            }
        }

        if (!encontrouPendente) {
            System.out.println("Nenhuma tarefa pendente encontrada!");
        }
    }

    public void exibirRelatorio() {

        int pendentes = 0;
        int concluidas = 0;

        for (Tarefa tarefa : tarefas) {
            if (tarefa.isConcluida()) {
                concluidas++;
            } else {
                pendentes++;
            }
        }

        System.out.println("Total de tarefas: " + tarefas.size());
        System.out.println("Tarefas pendentes: " + pendentes);
        System.out.println("Tarefas concluídas: " + concluidas);
    }
}