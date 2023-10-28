package chainOfResponsibility;

import java.util.List;

public class DescontoItensEspeciais implements Desconto {

	private Desconto proximo;

	@Override
	public void implantarDesconto(Pedido pedido) {
		List<ItemPedido> itensPedido = pedido.getItensPedido();
		boolean temItensEspeciais = itensPedido.stream().anyMatch(x -> x.getTipo() == TipoDoItem.ESPECIAL);
		if (temItensEspeciais) {
			pedido.addDesconto(2);
		}
		if (proximo != null)
			proximo.implantarDesconto(pedido);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}