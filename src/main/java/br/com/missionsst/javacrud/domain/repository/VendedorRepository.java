package br.com.missionsst.javacrud.domain.repository;

import br.com.missionsst.javacrud.domain.model.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
