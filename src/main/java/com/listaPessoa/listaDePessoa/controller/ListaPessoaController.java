package com.listaPessoa.listaDePessoa.controller;

import com.listaPessoa.listaDePessoa.model.ListaPessoaModel;
import com.listaPessoa.listaDePessoa.service.ListaPessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.PermitAll;
import java.util.List;
import java.util.Optional;

@RestController
public class ListaPessoaController {

    @Autowired
    ListaPessoaService listaPessoaService;

    @GetMapping(path = "/listapessoa")
    public List<ListaPessoaModel> buscarTodasPessoas() {
        return listaPessoaService.buscarTodos();
    }

    @GetMapping(path = "/listapessoa/{codigo}")
    public Optional<ListaPessoaModel>buscarPorId(@PathVariable Long codigo) {
        return listaPessoaService.buscarId(codigo);
    }

    @PostMapping(path = "/listapessoa")
    @ResponseStatus(HttpStatus.CREATED)
    public ListaPessoaModel cadastrarPessoa(@RequestBody ListaPessoaModel listaPessoaModel) {
        return  listaPessoaService.cadastrar(listaPessoaModel);
    }

    @PutMapping(path = "/listapessoa/{codigo}")
    public ListaPessoaModel alterarPessoa(@RequestBody ListaPessoaModel listaPessoaModel) {
        return listaPessoaService.alterar(listaPessoaModel);
    }

    @DeleteMapping(path = "/listapessoa/{codigo}")
    public void deletarPessoa(@PathVariable Long codigo) {
        listaPessoaService.deletar(codigo);
    }
}
