package br.com.missionsst.javacrud.controller;

import br.com.missionsst.javacrud.domain.model.Vendedor;
import br.com.missionsst.javacrud.domain.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

public class VendedorController {
    @Autowired
    private VendedorRepository vendedorRepository;

    @GetMapping()
    public List<Vendedor> index() {
        return vendedorRepository.findAll();
    }

    @GetMapping("/{vendedorId}")
    public ResponseEntity<Vendedor> buscar(@PathVariable Long vendedorId) {
        Optional<Vendedor> vendedor = vendedorRepository.findById(vendedorId);

        if(vendedor.isPresent()){
            return ResponseEntity.ok(vendedor.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vendedor adicionar(@Valid @RequestBody Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }

    @PutMapping("/{vendedorId}")
    public ResponseEntity<Vendedor> atualizar(@Valid @PathVariable Long vendedorId, @RequestBody Vendedor vendedor){
        if(!vendedorRepository.existsById(vendedorId)){
            return ResponseEntity.notFound().build();
        }
        vendedor.setCodVendedor(vendedorId);
        vendedor = vendedorRepository.save(vendedor);
        return ResponseEntity.ok(vendedor);
    }

    @DeleteMapping("/{vendedorId}")
    public ResponseEntity<Void> remover(@PathVariable Long vendedorId){
        if(!vendedorRepository.existsById(vendedorId)){
            return ResponseEntity.notFound().build();
        }
        vendedorRepository.deleteById(vendedorId);
        return ResponseEntity.noContent().build();
    }





}
