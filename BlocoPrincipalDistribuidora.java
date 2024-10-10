package arvore;

import dados.Fornecedor;
import dados.Produto;

import java.util.Scanner;

public class BlocoPrincipalDistribuidora {
    public static void main(String[] args) {
        ArvoreForn arvoreForn = new ArvoreForn();
        ArvoreProd arvoreProd = new ArvoreProd();
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Escolha uma opção: ");
            while (!entrada.hasNextInt()) {
                System.out.println("Por favor, insira um número válido.");
                entrada.next(); // Descarta a entrada inválida
                System.out.print("Escolha uma opção: ");
            }
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    inserirFornecedor(arvoreForn, entrada);
                    break;

                case 2:
                    inserirProduto(arvoreForn, arvoreProd, entrada);
                    break;

                case 3:
                    pesquisarFornecedor(arvoreForn, entrada);
                    break;

                case 4:
                    pesquisarProduto(arvoreProd, entrada);
                    break;

                case 5:
                    removerFornecedor(arvoreForn, entrada);
                    break;

                case 6:
                    removerProduto(arvoreProd, entrada);
                    break;

                case 7:
                    alterarNomeFornecedor(arvoreForn, entrada);
                    break;

                case 8:
                    alterarCodigoFornecedor(arvoreForn, entrada);
                    break;

                case 9:
                    alterarProduto(arvoreProd, entrada);
                    break;

                case 10:
                    alterarCodigoProduto(arvoreProd, entrada);
                    break;

                case 11:
                    alterarQuantidadeProduto(arvoreProd, entrada);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    public static void exibirMenu() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Inserir fornecedor");
        System.out.println("2. Inserir produto");
        System.out.println("3. Pesquisar fornecedor");
        System.out.println("4. Pesquisar produto");
        System.out.println("5. Remover fornecedor");
        System.out.println("6. Remover produto");
        System.out.println("7. Alterar nome do fornecedor");
        System.out.println("8. Alterar código do fornecedor");
        System.out.println("9. Alterar produto");
        System.out.println("10. Alterar código do produto");
        System.out.println("11. Alterar quantidade do produto");
        System.out.println("0. Sair");
    }

    public static void inserirFornecedor(ArvoreForn arvoreForn, Scanner entrada) {
        System.out.print("Informe o código do fornecedor: ");
        int codForn = entrada.nextInt();
        entrada.nextLine(); // Consume newline
        System.out.print("Informe o nome do fornecedor: ");
        String nomeForn = entrada.nextLine();
        Fornecedor fornecedor = new Fornecedor(codForn, nomeForn);
        arvoreForn.inserir(fornecedor);
        System.out.println("Fornecedor inserido com sucesso!");
    }

    public static void inserirProduto(ArvoreForn arvoreForn, ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto: ");
        int codProd = entrada.nextInt();
        entrada.nextLine(); // Consume newline
        System.out.print("Informe o nome do produto: ");
        String nomeProd = entrada.nextLine();
        System.out.print("Informe a quantidade do produto: ");
        int quantidade = entrada.nextInt();
        System.out.print("Informe o código do fornecedor: ");
        int codFornProd = entrada.nextInt();
        Fornecedor fornecedorDoProduto = arvoreForn.buscarFornecedor(codFornProd);

        if (fornecedorDoProduto != null) {
            Produto produto = new Produto(codProd, nomeProd, codFornProd);
            fornecedorDoProduto.adicionarProduto(produto, quantidade);
            arvoreProd.inserir(produto);
            System.out.println("Produto inserido com sucesso no fornecedor.");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void pesquisarFornecedor(ArvoreForn arvoreForn, Scanner entrada) {
        System.out.print("Informe o código do fornecedor: ");
        int codFornPesq = entrada.nextInt();
        Fornecedor fornecedorPesquisado = arvoreForn.buscarFornecedor(codFornPesq);
        if (fornecedorPesquisado != null) {
            System.out.println("Fornecedor encontrado: " + fornecedorPesquisado.getNome());
            System.out.println("Produtos do fornecedor:");
            imprimirProdutos(fornecedorPesquisado);
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void pesquisarProduto(ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto: ");
        int codProdPesq = entrada.nextInt();
        if (arvoreProd.pesquisar(codProdPesq)) {
            System.out.println("Produto encontrado.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void removerFornecedor(ArvoreForn arvoreForn, Scanner entrada) {
        System.out.print("Informe o código do fornecedor para remoção: ");
        int codFornRem = entrada.nextInt();
        if (arvoreForn.remover(codFornRem)) {
            System.out.println("Fornecedor removido com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void removerProduto(ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto para remoção: ");
        int codProdRem = entrada.nextInt();
        if (arvoreProd.remover(codProdRem)) {
            System.out.println("Produto removido com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void alterarNomeFornecedor(ArvoreForn arvoreForn, Scanner entrada) {
        System.out.print("Informe o código do fornecedor para alteração de nome: ");
        int codFornAltNome = entrada.nextInt();
        entrada.nextLine(); // Consume newline
        System.out.print("Informe o novo nome do fornecedor: ");
        String novoNomeForn = entrada.nextLine();
        if (arvoreForn.alterarNome(codFornAltNome, novoNomeForn)) {
            System.out.println("Nome do fornecedor alterado com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado.");
        }
    }

    public static void alterarCodigoFornecedor(ArvoreForn arvoreForn, Scanner entrada) {
        System.out.print("Informe o código do fornecedor para alteração de código: ");
        int codFornAltCod = entrada.nextInt();
        System.out.print("Informe o novo código do fornecedor: ");
        int novoCodForn = entrada.nextInt();
        if (arvoreForn.alterarCodigo(codFornAltCod, novoCodForn)) {
            System.out.println("Código do fornecedor alterado com sucesso.");
        } else {
            System.out.println("Fornecedor não encontrado ou novo código já existe.");
        }
    }

    public static void alterarProduto(ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto para alteração: ");
        int codProdAlt = entrada.nextInt();
        entrada.nextLine(); // Consume newline
        System.out.print("Informe o novo nome do produto: ");
        String novoNomeProd = entrada.nextLine();
        System.out.print("Informe o novo código do fornecedor: ");
        int novoCodFornProd = entrada.nextInt();
        if (arvoreProd.alterarProduto(codProdAlt, novoNomeProd, novoCodFornProd)) {
            System.out.println("Produto alterado com sucesso.");
        } else {
            System.out.println("Produto não encontrado ou novo código de fornecedor não existe.");
        }
    }

    public static void alterarCodigoProduto(ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto para alteração de código: ");
        int codProdAltCod = entrada.nextInt();
        System.out.print("Informe o novo código do produto: ");
        int novoCodProd = entrada.nextInt();
        if (arvoreProd.alterarCodigo(codProdAltCod, novoCodProd)) {
            System.out.println("Código do produto alterado com sucesso.");
        } else {
            System.out.println("Produto não encontrado ou novo código já existe.");
        }
    }

    public static void alterarQuantidadeProduto(ArvoreProd arvoreProd, Scanner entrada) {
        System.out.print("Informe o código do produto para alteração de quantidade: ");
        int codProdAltQuant = entrada.nextInt();
        System.out.print("Informe a nova quantidade do produto: ");
        int novaQuantidade = entrada.nextInt();
        if (arvoreProd.alterarQuantidade(codProdAltQuant, novaQuantidade)) {
            System.out.println("Quantidade do produto alterada com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public static void imprimirProdutos(Fornecedor fornecedor) {
        for (Produto p : fornecedor.getProdutos().values()) {
            System.out.println(p);
        }
    }
}