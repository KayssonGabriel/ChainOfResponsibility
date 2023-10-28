package chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private double valorTotal;

	private List<ItemPedido> itensPedido = new ArrayList<>();

	public void addItemPedido(ItemPedido item) {
		itensPedido.add(item);
		this.valorTotal += item.getPreco();
	}

	public void addDesconto(double desconto) {
		this.valorTotal -= desconto;

	}

	public List<ItemPedido> getItensPedido() {
		return itensPedido;
	}

	public double getTotal() {
		return valorTotal;
	}

}
