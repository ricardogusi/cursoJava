package com.example.exerciciossb.Repository;

//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.example.exerciciossb.Model.Produto;

public interface ProdutoRepository  extends PagingAndSortingRepository<Produto, Integer>{

//	@Query("SELECT p FROM Produto p WHERE p.nom LIKE %:nome%")
	public Iterable<Produto> findByNomeContaining(String parteNome);
}
