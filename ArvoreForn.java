package arvore;

import dados.Fornecedor;

public class ArvoreForn {
    private NoForn raiz;
    private int quantNos;

    public ArvoreForn() {
        this.quantNos = 0;
        this.raiz = null;
    }

    public boolean eVazia() {
        return (this.raiz == null);
    }

    public NoForn getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public boolean inserir(Fornecedor fornecedor) {
        if (pesquisar(fornecedor.getChave()) != null) {
            return false;
        } else {
            this.raiz = inserir(fornecedor, this.raiz);
            this.quantNos++;
            return true;
        }
    }

    private NoForn inserir(Fornecedor elem, NoForn no) {
        if (no == null) {
            return new NoForn(elem);
        } else {
            if (elem.getChave() < no.getInfo().getChave()) {
                no.setEsq(inserir(elem, no.getEsq()));
            } else {
                no.setDir(inserir(elem, no.getDir()));
            }
            return no;
        }
    }

    public Fornecedor pesquisar(int chave) {
        return pesquisar(chave, this.raiz);
    }

    private Fornecedor pesquisar(int chave, NoForn no) {
        if (no != null) {
            if (chave < no.getInfo().getChave()) {
                return pesquisar(chave, no.getEsq());
            } else if (chave > no.getInfo().getChave()) {
                return pesquisar(chave, no.getDir());
            } else {
                return no.getInfo();
            }
        }
        return null;
    }

    public boolean remover(int chave) {
        if (pesquisar(chave, this.raiz) != null) {
            this.raiz = remover(chave, this.raiz);
            this.quantNos--;
            return true;
        } else {
            return false;
        }
    }

    private NoForn remover(int chave, NoForn arv) {
        if (chave < arv.getInfo().getChave()) {
            arv.setEsq(remover(chave, arv.getEsq()));
        } else if (chave > arv.getInfo().getChave()) {
            arv.setDir(remover(chave, arv.getDir()));
        } else {
            if (arv.getDir() == null) {
                return arv.getEsq();
            } else if (arv.getEsq() == null) {
                return arv.getDir();
            } else {
                arv.setEsq(arrumar(arv, arv.getEsq()));
            }
        }
        return arv;
    }

    private NoForn arrumar(NoForn arv, NoForn maior) {
        if (maior.getDir() != null) {
            maior.setDir(arrumar(arv, maior.getDir()));
        } else {
            arv.setInfo(maior.getInfo());
            return maior.getEsq();
        }
        return maior;
    }

    public void listarFornecedores() {
        listarFornecedoresRecursivo(this.raiz);
    }

    private void listarFornecedoresRecursivo(NoForn no) {
        if (no != null) {
            listarFornecedoresRecursivo(no.getEsq());
            System.out.println(no.getInfo());
            listarFornecedoresRecursivo(no.getDir());
        }
    }


    public boolean removerFornecedor(int chave) {
        if (pesquisar(chave, this.raiz) != null) {
            this.raiz = remover(chave, this.raiz);
            this.quantNos--;
            return true;
        } else {
            return false;
        }
    }
}