package arvore;

import dados.Produto;
import dados.Fornecedor;

public class ArvoreProd {
    private NoProd raiz;
    private int quantNos; 
    
    public ArvoreProd() {
        this.quantNos = 0;
        this.raiz = null;
    }
    public boolean eVazia() {
        return (this.raiz == null);
    }

    public NoProd getRaiz() {
        return this.raiz;
    }

    public int getQuantNos() {
        return this.quantNos;
    }
    public void inserir(Produto produto) {
        raiz = inserirRecursivo(raiz, produto);
    }

    private NoProd inserirRecursivo(NoProd no, Produto produto) {
        if (no == null) {
            return new NoProd(produto);
        }

        if (produto.getChave() < no.getInfo().getChave()) {
            no.setEsq(inserirRecursivo(no.getEsq(), produto));
        } else if (produto.getChave() > no.getInfo().getChave()) {
            no.setDir(inserirRecursivo(no.getDir(), produto));
        }
        return no;
    }

    public Produto pesquisar(int chave) {
        return pesquisarRecursivo(raiz, chave);
    }

    private Produto pesquisarRecursivo(NoProd no, int chave) {
        if (no == null || no.getInfo().getChave() == chave) {
            return (no != null) ? no.getInfo() : null;
        }

        if (chave < no.getInfo().getChave()) {
            return pesquisarRecursivo(no.getEsq(), chave);
        } else {
            return pesquisarRecursivo(no.getDir(), chave);
        }
    }

    public boolean remover(int chave) {
        if (pesquisar(chave) != null) {
            raiz = removerRecursivo(raiz, chave);
            return true;
        }
        return false;
    }

    private NoProd removerRecursivo(NoProd no, int chave) {
        if (no == null) {
            return null;
        }

        if (chave < no.getInfo().getChave()) {
            no.setEsq(removerRecursivo(no.getEsq(), chave));
        } else if (chave > no.getInfo().getChave()) {
            no.setDir(removerRecursivo(no.getDir(), chave));
        } else {
            if (no.getEsq() == null) {
                return no.getDir();
            } else if (no.getDir() == null) {
                return no.getEsq();
            }

            no.setInfo(minimo(no.getDir()));
            no.setDir(removerRecursivo(no.getDir(), no.getInfo().getChave()));
        }

        return no;
    }

    private Produto minimo(NoProd no) {
        Produto min = no.getInfo();
        while (no.getEsq() != null) {
            min = no.getEsq().getInfo();
            no = no.getEsq();
        }
        return min;
    }

    public boolean alterarQuantidade(int chave, int quantidade) {
        Produto produto = pesquisar(chave);
        if (produto != null) {
            if (quantidade > 0) {
                produto.adicionarQuantidade(quantidade);
            } else {
                produto.removerQuantidade(-quantidade);
            }
            return true;
        }
        return false;
    }

    public boolean alterarFornecedor(int chave,int novoFornecedor) {
        Produto produto = pesquisar(chave);
        if (produto != null) {
            produto.setChaveFornecedor(novoFornecedor);
            return true;
        }
        return false;
    }

    public void listarProdutos() {
        listarProdutosRecursivo(raiz);
    }

    private void listarProdutosRecursivo(NoProd no) {
        if (no != null) {
            listarProdutosRecursivo(no.getEsq());
            System.out.println(no.getInfo());
            listarProdutosRecursivo(no.getDir());
        }
    }
    public void listarProdutosDoFornecedor(int chaveFornecedor) {
        listarProdutosDoFornecedorRecursivo(raiz, chaveFornecedor);
    }

    private void listarProdutosDoFornecedorRecursivo(NoProd no, int chaveFornecedor) {
        if (no != null) {
            listarProdutosDoFornecedorRecursivo(no.getEsq(), chaveFornecedor);
            if (no.getInfo().getFornecedor() == chaveFornecedor) {
                System.out.println(no.getInfo());
            }
            listarProdutosDoFornecedorRecursivo(no.getDir(), chaveFornecedor);
        }
    }
    public boolean remover1(int chave) {
        if (pesquisar(chave) != null) {
            raiz = removerRecursivo(raiz, chave);
            quantNos--;
            return true;
        }
        return false;
    }

    private NoProd removerRecursivo1(NoProd no, int chave) {
        if (no == null) {
            return null;
        }

        if (chave < no.getInfo().getChave()) {
            no.setEsq(removerRecursivo(no.getEsq(), chave));
        } else if (chave > no.getInfo().getChave()) {
            no.setDir(removerRecursivo(no.getDir(), chave));
        } else {
            if (no.getEsq() == null) {
                return no.getDir();
            } else if (no.getDir() == null) {
                return no.getEsq();
            } else {
                no.setInfo(minimo(no.getDir()));
                no.setDir(removerRecursivo(no.getDir(), no.getInfo().getChave()));
            }
        }
        return no;
    }

    private Produto minimo1(NoProd no) {
        Produto min = no.getInfo();
        while (no.getEsq() != null) {
            min = no.getEsq().getInfo();
            no = no.getEsq();
        }
        return min;
    }
    public Produto produtoComMaisQuantidade() {
        return produtoComMaisQuantidadeRecursivo(raiz);
    }

    private Produto produtoComMaisQuantidadeRecursivo(NoProd no) {
        if (no == null) {
            return null;
        }

        Produto atual = no.getInfo();
        Produto maximo = atual;

        Produto esq = produtoComMaisQuantidadeRecursivo(no.getEsq());
        Produto dir = produtoComMaisQuantidadeRecursivo(no.getDir());

        if (esq != null && esq.getQuantidade() > maximo.getQuantidade()) {
            maximo = esq;
        }
        if (dir != null && dir.getQuantidade() > maximo.getQuantidade()) {
            maximo = dir;
        }

        return maximo;
    }
    
}