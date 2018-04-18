package br.com.franca.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.franca.model.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produto produto) {
		manager.persist(produto);
	}

}
