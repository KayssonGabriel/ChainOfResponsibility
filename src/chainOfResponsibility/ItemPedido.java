package chainOfResponsibility;

public class ItemPedido {
	private String adesivo;
	private TipoDoItem tipo;
	private double preco;

	public ItemPedido(String nome, TipoDoItem tipo, double preco) {
		this.adesivo = nome;
		this.tipo = tipo;
		this.preco = preco;
	}

	public String getAdesivo() {
		return adesivo;
	}

	public TipoDoItem getTipo() {
		return tipo;
	}

	public double getPreco() {
		return preco;
	}

}
