package com.cadastroapp.repository;

import com.cadastroapp.model.Contato;
import org.springframework.data.repository.CrudRepository;

public interface ContatoRepository extends CrudRepository<Contato, String> {
}
