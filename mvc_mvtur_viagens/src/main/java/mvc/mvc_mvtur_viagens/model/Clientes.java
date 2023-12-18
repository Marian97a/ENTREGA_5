package mvc.mvc_mvtur_viagens.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
 public class Clientes {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String CPF;
	private String email;
	private String telefone;
	

	
	//toString
	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nome=" + nome + ", CPF=" + CPF + ", email=" + email + ", telefone=" + telefone
				+ "]";
	}
	
}