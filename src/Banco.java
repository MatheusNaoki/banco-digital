import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> contas;

	public Banco()
	{
		this.contas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cliente> getContas() {
		return contas;
	}

	public void addConta(Cliente cliente) {
		contas.add(cliente);
	}
}
