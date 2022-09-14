public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta();
        //conta.numero = 1337;
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente pipe = new Cliente();
        pipe.setNome("Luis Felipe");

        conta.setTitular(pipe);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        // em duas linhas:
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(pipe);
        System.out.println(conta.getTitular());
    }
}
