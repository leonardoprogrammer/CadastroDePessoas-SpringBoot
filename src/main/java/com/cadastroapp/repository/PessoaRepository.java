package com.cadastroapp.repository;

import com.cadastroapp.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, String> {
}
