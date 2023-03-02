public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(123);
        System.out.println(conta.getNumero());

        Cliente larissa = new Cliente();
        larissa.setNome("Larissa Fernandes");
        conta.setTitular(larissa);
        System.out.println(conta.getTitular().getNome());


        //com 1 linhas
        conta.getTitular().setProfissao("programadora");

        //com 2 linhas
        Cliente cliente = conta.getTitular();
        cliente.setProfissao("programador");

        //mesma pessoa, chamando de formas diferentes. Mas indo para o mesmo caminho
        System.out.println(cliente);
        System.out.println(larissa);
        System.out.println(conta.getTitular());


    }
}

