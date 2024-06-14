public class Empresa {
    public static void main(String[] args) throws Exception {
        
        //Classe Vendedor
        Vendedor vendedor1 = new Vendedor();

        vendedor1.setNome("Mateus");
        vendedor1.setCpf(05766633665);
        vendedor1.setTurno("Manhã");
        vendedor1.setMatricula(123);
        vendedor1.setMetaMes(10000.00);
        vendedor1.setSalario(2000.00);
        vendedor1.setDepartamento("Vendas");

        System.out.println("Nome: " +vendedor1.getNome());
        System.out.println("CPF: " +vendedor1.getCpf());
        System.out.println("Turno: " +vendedor1.getTurno());
        System.out.println("Matricula: " +vendedor1.getMatricula());
        System.out.println("MetaMed: " +vendedor1.getMetaMes());
        System.out.println("Salario: R$" +vendedor1.getSalario());
        System.out.println("Departamento: " +vendedor1.getDepartamento());
        
        vendedor1.realizarVenda(5000, 2);
        System.out.println("MetaAtual: "  + vendedor1.getMetalAtual());

        
        System.out.println("Salario com bonificicação: R$" + vendedor1.realizarBonificacao(300));
        

        //Classe Secretario
        Secreatario secreatario1 = new Secreatario();
        secreatario1.setNome("Jusara");
        secreatario1.setCpf(05562233665);
        secreatario1.setTurno("Tarde");
        secreatario1.setMatricula(124);
        secreatario1.setSalario(3000.00);
        secreatario1.setDepartamento("Secretaria");
        secreatario1.setRamalDisponivel(true);

        System.out.println("\nNome: " +secreatario1.getNome());
        System.out.println("CPF: " +secreatario1.getCpf());
        System.out.println("Turno: " +secreatario1.getTurno());
        System.out.println("Matricula: " +secreatario1.getMatricula());
        System.out.println("Salario: R$" +secreatario1.getSalario());
        System.out.println("Departamento: " +secreatario1.getDepartamento());
        System.out.println("Ramal disponivel: " +secreatario1.getRamalDisponivel());
        System.out.println("\n Marcar reunião:");
        System.out.println("Reunião marcarda ? "+secreatario1.marcarReuniao(true));


        //Classe Gerente
        Gerente gerente1 = new Gerente();
        gerente1.setNome("Jonas");
        gerente1.setCpf(05562113115);
        gerente1.setTurno("Tarde");
        gerente1.setMatricula(120);
        gerente1.setSalario(5000.00);
        gerente1.setDepartamento("Gerência");
        
        System.out.println("\nNome: " +gerente1.getNome());
        System.out.println("CPF: " + gerente1.getCpf());
        System.out.println("Turno: " + gerente1.getTurno());
        System.out.println("Matricula: " + gerente1.getMatricula());
        System.out.println("Salario: R$" + gerente1.getSalario());
        System.out.println("Departamento: " + gerente1.getDepartamento());
        System.out.println("\n Realizar reunião:");
        System.out.println("Reunião realizada ? " + gerente1.realizarReuniao(true, secreatario1.getStatusReuniao()));


        // TODO 
        // adicionar classe de cliete
        // comprou alguma coisa
        // se ligou
        // com quem comprou
    }
}
