package com.example.exerciciossb.Controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciossb.Model.Produto;
import com.example.exerciciossb.Repository.ProdutoRepository;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	
	@Autowired
	private ProdutoRepository produtoRepository;  
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
//	@PostMapping
	public @ResponseBody Produto novoProduto(
//			@RequestParam  String nome,
//			@RequestParam double preco,
//			@RequestParam double desconto
			
			@Valid Produto produto
			) {
//		Produto produto = new Produto(nome, preco, desconto);
		produtoRepository.save(produto);   
		return produto;
		
	}
	
	@GetMapping
	public Iterable<Produto>obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto>obterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContaining(parteNome);
	}
	
	@GetMapping("/pagina/{numeroPagina}/{qtdePagina}")
	public Iterable<Produto> obterProdutosPorPagina(
			@PathVariable int numeroPagina, @PathVariable int qtdePagina){
		if(qtdePagina >=5) qtdePagina = 5;
		Pageable page = PageRequest.of(numeroPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping("/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	
}
