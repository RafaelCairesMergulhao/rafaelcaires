package arvore;

import dados.Item;

public class No {
    private Item info;
    private No esq;
    private No dir;

    public No(Item elem) {
        this.info = elem;
        this.esq = null;
        this.dir = null;
    }

    public Item getInfo() {
        return info;
    }

    public void setInfo(Item info) {
        this.info = info;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }
}