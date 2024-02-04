package com.web.apirest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @SuppressWarnings("null")
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Filme cadastrar(@RequestBody Filme filme) {
        return filmeRepository.save(filme);
    }

    @GetMapping
    public List<Filme> listar() {
        return filmeRepository.findAll();
    }

    @SuppressWarnings("null")
    @GetMapping("/{id}")
    public Filme buscarPorId(@PathVariable Long id) {
        var filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return filmeOptional.get();
    }

    @SuppressWarnings("null")
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void excluirPorId(@PathVariable Long id) {
        var filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        filmeRepository.delete(filmeOptional.get());
    }

    @SuppressWarnings("null")
    @PutMapping("/{id}")
    public Filme atualizarPorId(@PathVariable Long id, @RequestBody Filme filme) {
        var filmeOptional = filmeRepository.findById(id);
        if (filmeOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        filme.setId(id);
        return filmeRepository.save(filme);
    }

}