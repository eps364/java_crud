package br.com.missionsst.javacrud.controller;

import br.com.missionsst.javacrud.domain.model.Departamento;
import br.com.missionsst.javacrud.domain.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private DepartamentoRepository departamentoRepository;

    @GetMapping()
    public List<Departamento> index() {
        return departamentoRepository.findAll();
    }

    @GetMapping("/{departamentoId}")
    public ResponseEntity<Departamento> buscar(@PathVariable Long departamentoId) {
        Optional<Departamento> departamento = departamentoRepository.findById(departamentoId);

        if(departamento.isPresent()){
            return ResponseEntity.ok(departamento.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Departamento adicionar(@Valid @RequestBody Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    @PutMapping("/{departamentoId}")
    public ResponseEntity<Departamento> atualizar(@Valid @PathVariable Long departamentoId, @RequestBody Departamento departamento){
        if(!departamentoRepository.existsById(departamentoId)){
            return ResponseEntity.notFound().build();
        }
        departamento.setCodDepartamento(departamentoId);
        departamento = departamentoRepository.save(departamento);
        return ResponseEntity.ok(departamento);
    }

    @DeleteMapping("/{departamentoId}")
    public ResponseEntity<Void> remover(@PathVariable Long departamentoId){
        if(!departamentoRepository.existsById(departamentoId)){
            return ResponseEntity.notFound().build();
        }
        departamentoRepository.deleteById(departamentoId);
        return ResponseEntity.noContent().build();
    }





}
