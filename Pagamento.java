
public class Pagamento {
    private float valor;
    private LocalDate data;


    public Pagamento(float valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }


    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }



    public Date getData() {
        return data;
    }

    public void setLocalData(LocalDate data) {
        this.data = data;
    }

    @Override
    public java.lang.String toString() {
        return "Pagamento{" +
                "valor=" + valor +
                ", data=" + data +
                '}';
    }
}
