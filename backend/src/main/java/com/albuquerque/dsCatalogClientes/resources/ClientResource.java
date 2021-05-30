package com.albuquerque.dsCatalogClientes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.albuquerque.dsCatalogClientes.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria Silva", "12345678901", 6500.0 , 2));
		list.add(new Client(2L, "José Silva", "12345678902", 6550.0 , 3));
		return ResponseEntity.ok().body(list);
	}
}
