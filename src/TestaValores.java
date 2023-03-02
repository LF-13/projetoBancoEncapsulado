public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(123, 123456);
        System.out.println(conta.getNumero());

        Conta conta2 = new Conta(123, 789456);
        System.out.println(Conta.getTotal());

    }
}


//    Conta conta = new Conta( 1337,24226);
//
//        System.out.println(conta.getAgencia());