package EmissaoPassagens;

public class EmissorPassagemRodoviaria extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double valorTarifa) {
        return new PassagemRodoviaria(passageiro, valorTarifa);
    }
}
