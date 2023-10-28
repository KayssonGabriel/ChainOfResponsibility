package chainOfResponsibility;

import java.util.List;

public class DescontoQuantidadeItens implements Desconto {

	private Desconto proximo;

	@Override
	public void implantarDesconto(Pedido pedido) {
		List<ItemPedido> itensPedido = pedido.getItensPedido();
		if (itensPedido.size() > 10) {
			pedido.addDesconto(5);
		}
		if (proximo != null)
			proximo.implantarDesconto(pedido);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
