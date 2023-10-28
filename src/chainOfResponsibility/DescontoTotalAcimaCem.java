package chainOfResponsibility;

public class DescontoTotalAcimaCem implements Desconto {

	private Desconto proximo;

	@Override
	public void implantarDesconto(Pedido pedido) {
		if (pedido.getTotal() > 100) {
			pedido.addDesconto(8);
		}
		if (proximo != null)
			proximo.implantarDesconto(pedido);
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}
}