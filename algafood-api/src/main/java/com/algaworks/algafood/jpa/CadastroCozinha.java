package com.algaworks.algafood.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.Cozinha;

@Component
public class CadastroCozinha {

	@PersistenceContext
	public EntityManager manager;
	
	public List<Cozinha> Listar(){
	//TypedQuery<Cozinha> query =	manager.createQuery("from Cozinha", Cozinha.class);

	//return query.getResultList();
		
		return manager.createQuery("from Cozinha", Cozinha.class) //método para listar todas as cozinhas
				.getResultList();
	}	
	
	
	public Cozinha buscar(Long id) {
		return manager.find(Cozinha.class, id);
	}
	
	
	@Transactional
	public Cozinha adicionar(Cozinha cozinha) {
		return manager.merge(cozinha);
	}
	
}
