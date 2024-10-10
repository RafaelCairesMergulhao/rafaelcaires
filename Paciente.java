package Veterinaria;
public class Paciente {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private String historico;

    // Construtor
    public Paciente(String nome, String cpf, String dataNascimento, String historico) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.historico = historico;
    }

    // Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // ToString
    @Override
    public String toString() {
        return nome + ", " + cpf + ", " + dataNascimento + "\n" + historico;
    }
}