public class Menu {

    public void menuInicial() {
    
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        InserirCliente inserirCliente = new InserirCliente();
        InserirFuncionario inserirFuncionario = new InserirFuncionario();
        InserirEstoque inserirEstoque = new InserirEstoque();
        InserirAgendamento inserirAgendamento = new InserirAgendamento();
        BuscarAgendamento buscarAgendamento = new BuscarAgendamento();
        Main main = new Main();
        Cliente cliente = new Cliente();
    
        do {
    
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("                 BARBEARIA");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("\n"
                    + "1 - Cadastro de Cliente.\n"
                    + "2 - Cadastro de Funcionário.\n"
                    + "3 - Venda de produtos.\n"
                    + "4 - Agendamento de clientes.\n"
                    + "5 - Estoque.\n"
                    + "6 - Encerrar.");
            opcao = sc.nextInt();
            switch (opcao) {
    
                case 1: {
                    inserirCliente.inserirCliente();
                }
    
                case 2: {
                    inserirFuncionario.inserirFuncionario();
                }
    
                case 4: {
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("                 AGENDAMENTO");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("\n"
                            + "1 - Novo agendamento.\n"
                            + "2 - Buscar agendamento.");
                    int opcaoAgendamento = sc.nextInt();
                    switch (opcaoAgendamento) {
                        case 1:
                            inserirAgendamento.inserirAgendamento();
                            break;
                        case 2:
                            buscarAgendamento.buscarAgendamento();
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
    
                case 5: {
                    inserirEstoque.inserirEstoque();
                }
    
                sc.close();
            }
    
        } while (opcao != 6);
    }
