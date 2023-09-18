public class App {
    public static void main(String[] args) throws Exception {
        /* Criação dos produtos */
        Produto prod1 = new Produto(1, 15.00, "Produto 1");
        Produto prod2 = new Produto(1, 30.50, "Produto 2");

        /* Criação do pedido */
        Pedido pedido1 = new Pedido();
        pedido1.adicionarItem(new ItemPedido(prod1, 2));
        pedido1.adicionarItem(new ItemPedido(prod2, 5));

        pedido1.obterTotal();

        /* Print do pedido */
        for(int i = 0; i < 10; i++){
            if(pedido1.getItens()[i] != null){
                System.out.printf("%s\n Quantidade: %d\n\n", pedido1.getItens()[i].prod.getDescr(), pedido1.getItens()[i].qtde);
            }
        }
        /* Print do valor total */
        System.out.printf("Total:\n %.2f\n", pedido1.getValorTotal());
        
    }
}
