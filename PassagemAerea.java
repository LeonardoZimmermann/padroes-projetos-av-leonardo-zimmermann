package EmissaoPassagens;

public class PassagemAerea extends Passagem {
    public PassagemAerea(String passageiro, double valorTarifa) {
        super(passageiro, valorTarifa);
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.08;
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e bilhete eletrônico (e-ticket)";
    }
}
