package org.mql.biblio.controllers;

import java.util.List;

import org.mql.biblio.business.BiblioService;
import org.mql.biblio.models.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
@CrossOrigin("*") // accepte tous les accès , préciser pour chaque controlleur
// à faire : la sotulion js : séparer (un autre projet) , thymeleaf 
public class DocumentController {
	@Autowired
	private BiblioService service;

	public DocumentController() {
	}

	@GetMapping
	public List<Document> getAllDocuments() {
		return service.documents();
	}

	@GetMapping("/{keyword}")
	public List<Document> getAllDocumentsByKeyword(@PathVariable String keyword) {
		return service.documents(keyword);
	}
}
