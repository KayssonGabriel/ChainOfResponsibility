# ChainOfResponsibility

Exemplo em Java do padrão comportamental Chain of Responsibility. Um pedido de adesivos passa por uma cadeia de regras independentes e acumula os descontos aplicáveis.

## Fluxo do exemplo

1. [DescontoItensEspeciais](src/chainOfResponsibility/DescontoItensEspeciais.java) desconta 2 quando existe pelo menos um item especial.
2. [DescontoQuantidadeItens](src/chainOfResponsibility/DescontoQuantidadeItens.java) desconta 5 quando o pedido tem mais de 10 itens.
3. [DescontoTotalAcimaCem](src/chainOfResponsibility/DescontoTotalAcimaCem.java) desconta 8 quando o total naquele ponto da cadeia excede 100.

[App.java](src/chainOfResponsibility/App.java) cria o pedido de exemplo e encadeia as regras. [Pedido.java](src/chainOfResponsibility/Pedido.java) mantém os itens e o total acumulado.

## Como executar

Com JDK 9 ou superior, execute na raiz:

```bash
javac -encoding UTF-8 -d build src/module-info.java src/chainOfResponsibility/*.java
java -cp build chainOfResponsibility.App
```

O exemplo usa um pedido de três itens com total inicial de 124 e imprime `114.0` após os descontos.
