public class Tarefa {

    private int codigo;
    private String descricao;
    private String responsavel;
    private String prioridade;
    private boolean concluida;

    public Tarefa(int codigo, String descricao, String responsavel, String prioridade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

}



