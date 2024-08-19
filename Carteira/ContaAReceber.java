import java.util.List;

public class ContaAReceber {
    public class ContaAReceber implements ContaInterface{
        private List<pagamento>pagamentoList;
        private float valor;
        private String font;

        public ContaAReceber(float valor, String font) {
            pagamentoList = new ArrayList<Pagamento>();
            this.valor = valor;
            this.font = font;
        }

        @Override
        public java.lang.String toString() {
            return "ContaAReceber{" +
                    "pagamentoList=" + pagamentoList +
                    ", valor=" + valor +
                    ", font='" + font + '\'' +
                    '}';
        }

        public List<pagamento> getPagamentoList() {
            return pagamentoList;
        }

        public void setPagamentoList(List<pagamento> pagamentoList) {
            this.pagamentoList = pagamentoList;
        }

        public float getValor() {
            return valor;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public String getFont() {
            return font;
        }

        public void setFont(String font) {
            this.font = font;
        }

        private double valorPago = 0;

        @Override
        public void addPagamento(pagamento p)throws exception{
            if(valorPago+p.getValor()>valor)
                throw new Exception ("valor excedeu a conta!");
            pagamentoList.add(p);
            valorPago = valorPago + p.getValor();
        }
    }
}
