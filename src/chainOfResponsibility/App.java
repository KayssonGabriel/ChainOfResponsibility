package chainOfResponsibility;

public class App {

	public static void main(String[] args) {
		ItemPedido item1 = new ItemPedido("Adesivo 1", TipoDoItem.NORMAL, 99);
		ItemPedido item2 = new ItemPedido("Adesivo 2", TipoDoItem.NORMAL, 10);
		ItemPedido item3 = new ItemPedido("Adesivo 3", TipoDoItem.ESPECIAL, 15);

		// Criamos um pedido
		Pedido pedido = new Pedido();
		pedido.addItemPedido(item1);
		pedido.addItemPedido(item2);
		pedido.addItemPedido(item3);

		// Criamos os objetos de desconto
		Desconto cadeiaDeDescontos = new DescontoItensEspeciais();
		Desconto descontoQtdeItens = new DescontoQuantidadeItens();
		Desconto valorAcimaDeCem = new DescontoTotalAcimaCem();

		// Definimos a cadeia
		descontoQtdeItens.setProximo(valorAcimaDeCem);
		cadeiaDeDescontos.setProximo(descontoQtdeItens);

		// Implantamos os descontos
		cadeiaDeDescontos.implantarDesconto(pedido);

		System.out.println(pedido.getTotal());
	}
}
