package com.listaPessoa.listaDePessoa.repository;

import com.listaPessoa.listaDePessoa.model.ListaPessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaPessoaRepository extends JpaRepository<ListaPessoaModel, Long> {
}
