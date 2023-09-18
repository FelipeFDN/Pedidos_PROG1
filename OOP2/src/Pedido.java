public class Pedido {
    /* Atributos */
    private ItemPedido itens[];
    private Double valorTotal; 
    
    /* Métodos */
    public Pedido(){
        this.itens = new ItemPedido[10];
        this.valorTotal = 0.0; 
    }public void adicionarItem(ItemPedido it){
        for(int i = 0; i < 5; i++){
            if(this.itens[i] == null){
                this.itens[i] = it;
                return;
            }
        }
    }public void obterTotal(){
        for(int i = 0; i < 5; i++){
            if(this.itens[i] != null){
                this.valorTotal += (this.itens[i].prod.getValor() * this.itens[i].qtde);
            }
        }
    }
    public ItemPedido[] getItens() {
        return itens;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
}