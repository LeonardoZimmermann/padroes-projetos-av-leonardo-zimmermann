package EmissaoPassagens;

public abstract class Passagem {
    protected String passageiro;
    protected double valorTarifa;

    public Passagem(String passageiro, double valorTarifa) {
        this.passageiro = passageiro;
        this.valorTarifa = valorTarifa;
    }

    public abstract double calcularTaxaEmbarque();
    public abstract String getModal();
    public abstract String getDocumentosExigidos();

    public String getPassageiro() {
        return passageiro;
    }
}
