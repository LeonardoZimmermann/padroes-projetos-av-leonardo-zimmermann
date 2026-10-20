package EmissaoPassagens;

public abstract class EmissorPassagem {
    protected abstract Passagem criarPassagem(String passageiro, double valorTarifa);

    public void emitirPassagem(String passageiro, double valorTarifa) {
        Passagem passagem = criarPassagem(passageiro, valorTarifa);
        double taxa = passagem.calcularTaxaEmbarque();

        System.out.println("===== RESUMO DA EMISSÃO =====");
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getPassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos exigidos: " + passagem.getDocumentosExigidos());
        System.out.println();
    }
}
