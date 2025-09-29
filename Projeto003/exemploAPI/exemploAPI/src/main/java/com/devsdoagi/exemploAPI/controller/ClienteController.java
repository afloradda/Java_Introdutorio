package com.devsdoagi.exemploAPI.controller;

import com.devsdoagi.exemploAPI.model.Cliente;
import com.devsdoagi.exemploAPI.repository.ClienteRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indica que a classe expõe API REST
@RequestMapping("/clientes") // define o caminho base da API
public class ClienteController {

    private final ClienteRepository repository;

    /* Aqui ocorre uma "injeção de dependencia". O SpringBoot injeta a implementação concreta
       do ClienteRepository no construtor do ClienteController */

    /* A "injeção de dependência" serve justamente para suprir a instância da interface. Ou seja,
       estamos extendendo a dependencia pela interface ClienteReporitory e temos acesso desta a partir do atributo */

    public ClienteController(ClienteRepository repository){
        this.repository = repository;
    }


    @GetMapping
    public List<Cliente> listar(){
        return repository.findAll(); /* Perceba que, abaixo fazemos */
    }

    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado."));
    }

    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente dados){
        Cliente c = repository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado."));

        c.setNome(dados.getNome());
        c.setEmail(dados.getEmail());

        return repository.save(c);
    }

    /* Lembrando que, é legal ter em mente fazer o delete desta forma não é o melhor jeito.
       Na prática temos uma coluna 'flat' que sinaliza se aquele item é ativo ou não. */
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        repository.deleteById(id);
    }


}
