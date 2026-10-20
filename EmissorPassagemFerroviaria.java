package EmissaoPassagens;

public class EmissorPassagemFerroviaria extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double valorTarifa) {
        return new PassagemFerroviaria(passageiro, valorTarifa);
    }
}
