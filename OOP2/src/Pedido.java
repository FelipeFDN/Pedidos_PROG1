public class Pedido {
    /* Atributos */
    private ItemPedido itens[];
    private Double valorTotal; 
    
    /* Métodos */
    public Pedido(){
        this.itens = new ItemPedido[5];
        this.valorTotal = 0.0; 
    }public void adicionarItem(ItemPedido it){
        for(int i = 0; i < 5; i++){
            if(this.itens[i].qtde == 0){
                this.itens[i] = it;
                return;
            }
        }
    }public void obterTotal(){
        for(int i = 0; i < 5; i++){
            this.valorTotal += (this.itens[i].prod.getValor() * this.itens[i].qtde);
        }
    }
    public ItemPedido[] getItens() {
        return itens;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
}