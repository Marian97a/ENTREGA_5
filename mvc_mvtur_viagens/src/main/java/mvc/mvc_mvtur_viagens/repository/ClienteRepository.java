package mvc.mvc_mvtur_viagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.mvc_mvtur_viagens.model.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}
