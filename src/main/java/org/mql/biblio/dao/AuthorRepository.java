package org.mql.biblio.dao;

import java.util.List;

import org.mql.biblio.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	// on peut définir des services qu'on veut , juste en respectant la convention
	// de nommage
	// le nom et les parametres , doivent correspondre avec les properiétés de notre
	// models select keyword from ... where keyword = ...

	/*
	 * JPQL : Java Persistence Query Language C'est une adaptation SQL pour
	 * intérroger les entités plutot que les tables. Il s'agit de requetes orienté
	 * objet ( entity )
	 */
	@Query("SELECT a FROM Author a WHERE a.name LIKE :keyword%")
	public List<Author> findByKeyword(String keyword);
	
}
