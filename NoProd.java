package arvore;

import dados.Produto;

public class NoProd {
    private Produto info;
    private NoProd esq;
    private NoProd dir;

    public NoProd(Produto elem) {
        this.info = elem;
        this.esq = null;
        this.dir = null;
    }

    public Produto getInfo() {
        return info;
    }

    public void setInfo(Produto info) {
        this.info = info;
    }

    public NoProd getEsq() {
        return esq;
    }

    public void setEsq(NoProd esq) {
        this.esq = esq;
    }

    public NoProd getDir() {
        return dir;
    }

    public void setDir(NoProd dir) {
        this.dir = dir;
    }
}