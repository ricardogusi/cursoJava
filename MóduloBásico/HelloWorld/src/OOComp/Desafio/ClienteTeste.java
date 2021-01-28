package OOComp.Desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        

        Cliente cliente = new Cliente("Maria Julia");

        Compra compra1 = new Compra ();
        compra1.adicionarItem("Caneta", 9.67, 100);

        compra1.adicionarItem(new Produto("Notebook", 1987.88), 2);


        Compra compra2 = new Compra ();
        compra2.adicionarItem("Caderno",10, 10);
        
        compra2.adicionarItem(new Produto("Impressora", 998.09), 1);


        cliente.compras.add(compra1);
        cliente.compras.add(compra2);


        System.out.println(cliente.obterValorTotal());
    }
}
