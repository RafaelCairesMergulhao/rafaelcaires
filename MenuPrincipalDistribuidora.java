package arvore;

import java.util.Scanner;
import dados.Fornecedor;
import dados.Produto;

public class MenuPrincipalDistribuidora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreForn arvoreForn = new ArvoreForn();
        ArvoreProd arvoreProd = new ArvoreProd();
        

        while (true) {
            
            System.out.println("*********** Menu Principal Distribuidora **********");
            System.out.println("************Criado por Rafael Caires Mergulhão*************************\n");
            System.out.println("1.  Inserir Fornecedor");
            System.out.println("2.  Inserir Produto");
            System.out.println("3.  Alterar Quantidade de Produto");
            System.out.println("4.  Alterar Fornecedor de Produto");
            System.out.println("5.  Listar Fornecedores");
            System.out.println("6.  Listar Produtos");
            System.out.println("7.  Remover Fornecedor");
            System.out.println("8.  Quantidade de Produtos, por fornecedor");
            System.out.println("9.  Remover Produto");
            System.out.println("10. Produto com maior quantidade");
            System.out.println("11. Sair");
            System.out.println("*************************************");
           
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a chave do fornecedor: \n");
                    int chaveFornecedor = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do fornecedor: \n");
                    String nomeFornecedor = scanner.nextLine();

                    Fornecedor fornecedor = new Fornecedor(chaveFornecedor, nomeFornecedor);
                    if (arvoreForn.inserir(fornecedor)) {
                        System.out.println("Fornecedor inserido com sucesso.\n");
                    } else {
                        System.out.println("Fornecedor já existente.\n");
                    }
                    break;
                    

                case 2:
                    System.out.print("Digite a chave do produto: \n");
                    int chaveProduto = scanner.nextInt();
                    scanner.nextLine();

               
                    if (arvoreProd.pesquisar(chaveProduto) != null) {
                        System.out.println("Produto já existe. Não é possível inserir.\n");
                        break;
                    }

                    System.out.print("Digite o nome do produto: \n");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: \n");
                    int quantidadeProduto = scanner.nextInt();
                    if (quantidadeProduto < 0) {
                        System.out.println("Quantidade inválida. A quantidade deve ser não negativa.");
                        break;
                    }
                    System.out.print("Digite a chave do fornecedor: \n");
                    int chaveFornProduto = scanner.nextInt();
                    Fornecedor fornecedorProduto = arvoreForn.pesquisar(chaveFornProduto);
                    if (fornecedorProduto != null) {
                        Produto produto = new Produto(chaveProduto, nomeProduto, quantidadeProduto, chaveFornProduto);
                        arvoreProd.inserir(produto);
                        System.out.println("Produto inserido com sucesso.\n");
                    } else {
                        System.out.println("Fornecedor não encontrado.\n");
                    }
                    break;

                case 3:
                    System.out.print("Digite a chave do produto: \n");
                    chaveProduto = scanner.nextInt();
                    System.out.print("Digite a quantidade a adicionar/remover (use negativo para remover): \n");
                    quantidadeProduto = scanner.nextInt();
                    if (arvoreProd.alterarQuantidade(chaveProduto, quantidadeProduto)) {
                        System.out.println("Quantidade alterada com sucesso.\n");
                    } else {
                        System.out.println("Produto não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.print("Digite a chave do produto: \n");
                    chaveProduto = scanner.nextInt();
                    System.out.print("Digite a chave do novo fornecedor: \n");
                    chaveFornProduto = scanner.nextInt();
                    fornecedorProduto = arvoreForn.pesquisar(chaveFornProduto);
                    if (fornecedorProduto != null) {
                        if (arvoreProd.alterarFornecedor(chaveProduto, chaveFornProduto)) {
                            System.out.println("Fornecedor alterado com sucesso.\n");
                        } else {
                            System.out.println("Produto não encontrado.\n");
                        }
                    } else {
                        System.out.println("Fornecedor não encontrado.\n");
                    }
                    break;

                case 5:
                    System.out.println("Listando fornecedores:\n");
                    arvoreForn.listarFornecedores();
                    break;

                case 6:
                    System.out.println("Listando produtos:\n");
                    arvoreProd.listarProdutos();
                    break;

                case 7:
                    System.out.print("Digite a chave do fornecedor a ser removido: \n");
                    chaveFornecedor = scanner.nextInt();
                    if (arvoreForn.removerFornecedor(chaveFornecedor)) {
                        System.out.println("Fornecedor removido com sucesso.\n");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Escolha um número de 1 a 9. \n");
                    break;
                case 8:
                    System.out.println("Digite a chave do fornecedor para listar seus produtos: \n");
                    chaveFornecedor = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    fornecedor = arvoreForn.pesquisar(chaveFornecedor);
                    if (fornecedor != null) {
                        System.out.println("Produtos do fornecedor " + fornecedor.getNome() + ":");
                      
                        arvoreProd.listarProdutosDoFornecedor(chaveFornecedor);
                    } else {
                        System.out.println("Fornecedor não encontrado. \n");
                    }
                    break;

                case 9: 
                    System.out.print("Digite a chave do produto a ser removido: \n");
                    int chaveRemover = scanner.nextInt();
                    scanner.nextLine();
                    if (arvoreProd.remover(chaveRemover)) {
                        System.out.println("Produto removido com sucesso. \n");
                    } else {
                        System.out.println("Produto não encontrado. \n");
                    }
                    break;
                    
                case 10:
                    Produto produtoComMaisQuantidade = arvoreProd.produtoComMaisQuantidade();
                    if (produtoComMaisQuantidade != null) {
                        System.out.println("Produto com maior quantidade: \n");
                        System.out.println(produtoComMaisQuantidade);
                    } else {
                        System.out.println("Não há produtos cadastrados. \n");
                    }
                    break;
                    
                case 11:
                    System.out.println("Saindo...");
                                       scanner.close();
                                       System.exit(0);
                                       break;
            }
        }
    }
}