package arvore;

import dados.Item;

public class Arvore {
    private NoArv raiz;
    private int quantNos;

    public Arvore() {
        this.quantNos = 0;
        this.raiz = null;
    }

    public boolean eVazia() {
        return (this.raiz == null);
    }

    public NoArv getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }

    public boolean inserir(Item elem) {
        if (pesquisar(elem.getChave())) {
            return false;
        } else {
            this.raiz = inserir(elem, this.raiz);
            this.quantNos++;
            return true;
        }
    }

    public NoArv inserir(Item elem, NoArv no) {
        if (no == null) {
            return new NoArv(elem);
        } else {
            if (elem.getChave() < no.getInfo().getChave()) {
                no.setEsq(inserir(elem, no.getEsq()));
            } else {
                no.setDir(inserir(elem, no.getDir()));
            }
            return no;
        }
    }

    public boolean pesquisar(int chave) {
        return pesquisar(chave, this.raiz) != null;
    }

    private NoArv pesquisar(int chave, NoArv no) {
        if (no != null) {
            if (chave < no.getInfo().getChave()) {
                return pesquisar(chave, no.getEsq());
            } else if (chave > no.getInfo().getChave()) {
                return pesquisar(chave, no.getDir());
            }
        }
        return no;
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

    public NoArv remover(int chave, NoArv arv) {
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

    private NoArv arrumar(NoArv arv, NoArv maior) {
        if (maior.getDir() != null) {
            maior.setDir(arrumar(arv, maior.getDir()));
        } else {
            arv.setInfo(maior.getInfo());
            return maior.getEsq();
        }
        return maior;
    }

    public Item[] CamCentral() {
        Item[] vet = new Item[this.quantNos];
        int[] n = {0};
        return FazCamCentral(this.raiz, vet, n);
    }

    private Item[] FazCamCentral(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet = FazCamCentral(arv.getEsq(), vet, n);
            vet[n[0]++] = arv.getInfo();
            vet = FazCamCentral(arv.getDir(), vet, n);
        }
        return vet;
    }

    public Item[] CamPreFixado() {
        Item[] vet = new Item[this.quantNos];
        int[] n = {0};
        return FazCamPreFixado(this.raiz, vet, n);
    }

    private Item[] FazCamPreFixado(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet[n[0]++] = arv.getInfo();
            vet = FazCamPreFixado(arv.getEsq(), vet, n);
            vet = FazCamPreFixado(arv.getDir(), vet, n);
        }
        return vet;
    }

    public Item[] CamPosFixado() {
        Item[] vet = new Item[this.quantNos];
        int[] n = {0};
        return FazCamPosFixado(this.raiz, vet, n);
    }

    private Item[] FazCamPosFixado(NoArv arv, Item[] vet, int[] n) {
        if (arv != null) {
            vet = FazCamPosFixado(arv.getEsq(), vet, n);
            vet = FazCamPosFixado(arv.getDir(), vet, n);
            vet[n[0]++] = arv.getInfo();
        }
        return vet;
    }
}