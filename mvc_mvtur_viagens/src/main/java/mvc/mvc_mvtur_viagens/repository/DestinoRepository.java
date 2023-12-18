package mvc.mvc_mvtur_viagens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mvc.mvc_mvtur_viagens.model.Destinos;

@Repository
public interface DestinoRepository extends JpaRepository<Destinos, Long> {

}
