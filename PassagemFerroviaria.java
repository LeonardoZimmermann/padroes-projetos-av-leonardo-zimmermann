package EmissaoPassagens;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String passageiro, double valorTarifa) {
        super(passageiro, valorTarifa);
    }

    @Override
    public double calcularTaxaEmbarque() {
        return valorTarifa * 0.05;
    }

    @Override
    public String getModal() {
        return "Ferroviário";
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documento de identidade com foto e comprovante de reserva";
    }
}
