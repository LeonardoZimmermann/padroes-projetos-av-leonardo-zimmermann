package EmissaoPassagens;

public class PassagemRodoviaria extends Passagem {
    public PassagemRodoviaria(String passageiro, double valorTarifa) {
        super(passageiro, valorTarifa);
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.03;
    }

    @Override
    public String getModal() {
        return "Rodoviário";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto";
    }
}
