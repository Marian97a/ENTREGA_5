package mvc.mvc_mvtur_viagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "passagem")
 public class Passagens {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private double valor_passagem;
	
	 Clientes cliente;
	 Destinos destino;
	 
	public Passagens() {
	}

    @Override
    public String toString() {
        return "Passagens [id=" + id + ", valor_passagem=" + valor_passagem + ", cliente=" + cliente + ", destino="
                + destino + "]";
    }


}