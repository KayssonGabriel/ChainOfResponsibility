package chainOfResponsibility;

public interface Desconto {

	void implantarDesconto(Pedido pedido);

	void setProximo(Desconto desconto);

}