package Matriculas;

public class PagamentoWebpay implements ProcessamentoPagamento {
    @Override
    public String getDescricao() {
        return "Pagamento via Webpay";
    }
}
