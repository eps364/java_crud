package br.com.missionsst.javacrud.domain.repository;

import br.com.missionsst.javacrud.domain.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

}
