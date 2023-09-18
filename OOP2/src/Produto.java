public class Produto {
    /* Atributos */
    private int codigo;
    private Double valor;
    private String descr;
    
    /* Métodos */
    public Produto(int cod, Double val, String desc){
        this.codigo = cod;
        this.valor = val;
        this.descr = desc;
    }public Double getValor(){
        return this.valor;
    }
}
