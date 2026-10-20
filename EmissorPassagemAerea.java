package EmissaoPassagens;

public class EmissorPassagemAerea extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String passageiro, double valorTarifa) {
        return new PassagemAerea(passageiro, valorTarifa);
    }
}
