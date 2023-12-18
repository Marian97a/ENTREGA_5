package mvc.mvc_mvtur_viagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "destino")
 public class Destinos {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String origem;
	private String destino;
	private String data_partida;
	private String data_chegada;
	
	public Destinos() {
	}

    @Override
    public String toString() {
        return "Destinos [id=" + id + ", origem=" + origem + ", destino=" + destino + ", data_partida=" + data_partida
                + ", data_chegada=" + data_chegada + "]";
    }

    

}