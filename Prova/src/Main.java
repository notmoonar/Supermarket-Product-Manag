import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        ///Tema: Supermercado gerenciando produtos
        int navMenu = 0, imputID = 0, imputQTD = 0;
        double imputPreco = 0;

        String imputNome, menu = """
        ************************************     
                    - Bem vindo -           
            
            1 - Cadastrar Produto.
            2 - Consultar Produto.
            3 - Sair.

        ************************************
        """,
        menuCadastro = """
        ************************************     
                     - Cadastro -           

            Digite Respectivamente: 
            
             - Nome do produto.
             - ID do produto.
             - Quandidade adicionada.
             - Preço do produto.

        ************************************
        """,
        menuConsulta = """
        ************************************
                     - Consulta -           

             - Digite o ID do produto:

        ************************************
        """;

        Scanner scanner = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<Produto>();


        while (navMenu != 3) {
            System.out.println(menu);
            navMenu = Integer.parseInt(scanner.nextLine());

            if (navMenu == 1) {
                System.out.println(menuCadastro);
                
                System.out.println("Nome: ");
                imputNome = scanner.nextLine();

                System.out.println("ID do produto: ");
                imputID = Integer.parseInt(scanner.nextLine());
                
                System.out.println("Quantidade adicional de produtos: ");
                imputQTD = Integer.parseInt(scanner.nextLine());
                
                System.out.println("Preço do produto: ");
                imputPreco = Double.parseDouble(scanner.nextLine());

                produtos.add(new Produto(imputNome, 
                imputID, imputQTD, imputPreco));

                System.out.println("Feito!*");
            }

            if (navMenu == 2) {
                System.out.println(menuConsulta);
                imputID = Integer.parseInt(scanner.nextLine());
            
                for (Produto produto : produtos) {
                    if (produto.getId() == imputID) {
                        System.out.println("Nome: " + 
                        produto.getNome());

                        System.out.println("ID: " + 
                        produto.getId());

                        System.out.println("Quantidade: " + 
                        produto.getQuant());

                        System.out.println("Preço: " + 
                        produto.getPreco());

                        break;

                    }
                }
            }
        }
    
    scanner.close();
        
    }
}
