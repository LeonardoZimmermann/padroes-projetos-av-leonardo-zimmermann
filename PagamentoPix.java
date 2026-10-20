package Matriculas;

public class PagamentoPix implements ProcessamentoPagamento {
    @Override
    public String getDescricao() {
        return "Pagamento via Pix";
    }
}
