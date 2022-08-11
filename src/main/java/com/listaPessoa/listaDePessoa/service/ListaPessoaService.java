package com.listaPessoa.listaDePessoa.service;


import com.listaPessoa.listaDePessoa.model.ListaPessoaModel;
import com.listaPessoa.listaDePessoa.repository.ListaPessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListaPessoaService {

    @Autowired
    private ListaPessoaRepository listaPessoaRepository;

    public List<ListaPessoaModel> buscarTodos() {
        return listaPessoaRepository.findAll();
    }


    public Optional<ListaPessoaModel> buscarId(Long codigo) {
        return listaPessoaRepository.findById(codigo);
    }

    public ListaPessoaModel cadastrar (ListaPessoaModel listaPessoaModel) {
        listaPessoaModel.getCodigo();
        listaPessoaModel.getNome();
        listaPessoaModel.getCpf();
        listaPessoaModel.getNascimento();
        return listaPessoaRepository.save(listaPessoaModel);
    }

    public ListaPessoaModel alterar(ListaPessoaModel listaPessoaModel) {
        listaPessoaModel.getCodigo();
        listaPessoaModel.getNome();
        listaPessoaModel.getCpf();
        listaPessoaModel.getNascimento();
        return listaPessoaRepository.save(listaPessoaModel);
    }

    public void deletar(Long codigo) {listaPessoaRepository.deleteById(codigo);}
}
