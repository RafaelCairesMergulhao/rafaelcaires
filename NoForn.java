package arvore;

import dados.Fornecedor;

public class NoForn {
    private Fornecedor info;
    private NoForn esq;
    private NoForn dir;

    public NoForn(Fornecedor elem) {
        this.info = elem;
        this.esq = null;
        this.dir = null;
    }

    public Fornecedor getInfo() {
        return info;
    }

    public void setInfo(Fornecedor info) {
        this.info = info;
    }

    public NoForn getEsq() {
        return esq;
    }

    public void setEsq(NoForn esq) {
        this.esq = esq;
    }

    public NoForn getDir() {
        return dir;
    }

    public void setDir(NoForn dir) {
        this.dir = dir;
    }
}