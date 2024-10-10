package Veterinaria;

public class VetPaciente {
    private Paciente[] vet;
    private int nElem;

    // Construtor
    public VetPaciente(int tamanho) {
        vet = new Paciente[tamanho];
        nElem = 0;
    }

    // Getters
    public int getNElem() {
        return nElem;
    }

    // Método para obter um paciente por posição
    public Paciente getPaciente(int posicao) {
        if (posicao >= 0 && posicao < nElem) {
            return vet[posicao];
        }
        return null;
    }

    // Método para pesquisar paciente pelo CPF
    public int pesquisa(String cpf) {
        for (int i = 0; i < nElem; i++) {
            if (vet[i].getCpf().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }

    // Método para inserir um paciente
    public int insere(Paciente paciente) {
        if (nElem >= vet.length) {
            return -1; // Vetor cheio
        }
        if (pesquisa(paciente.getCpf()) != -1) {
            return -2; // Paciente já cadastrado
        }
        vet[nElem] = paciente;
        nElem++;
        return 0; // Inserção bem-sucedida
    }

    // Método para remover um paciente
    public boolean remove(String cpf) {
        int posicao = pesquisa(cpf);
        if (posicao == -1) {
            return false; // Paciente não encontrado
        }
        for (int i = posicao; i < nElem - 1; i++) {
            vet[i] = vet[i + 1]; // Desloca os pacientes para preencher a posição
        }
        vet[nElem - 1] = null; // Remove a referência do último paciente
        nElem--;
        return true; // Remoção bem-sucedida
    }
}