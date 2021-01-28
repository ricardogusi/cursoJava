package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lápis", 1.99, 0.12,0);
		Produto p2 = new Produto("Notebook", 4899, 0.2,0);
		Produto p3 = new Produto("Caderno", 19, 0.42,0);
		Produto p4 = new Produto("Impressora", 1199, 0.42,0);
		Produto p5 = new Produto("Ipad", 3199, 0.29,0);
		Produto p6 = new Produto("Relógio", 1909, 0.12,0);
		Produto p7 = new Produto("Monitor", 800.99, 0.22,0);
		
		List<Produto> produtos = 
				Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 0.30;
		Predicate<Produto> freteGratis = p -> p.valorFrete == 0;
		Predicate<Produto> produtoRelevante = p -> p.preco >= 500;		
		
		Function<Produto, String> chamadaPromo = 
				p -> "Aproveite! " + p.nome + " por R$" + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevante)
			.map(chamadaPromo)
			.forEach(System.out::println);
		
		}
}
