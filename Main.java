package EmissaoPassagens;

public class Main {
    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorPassagemAerea();
        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria();

        emissorAereo.emitirPassagem("Leonardo", 1000.00);
        emissorRodoviario.emitirPassagem("Leonardo", 200.00);
        emissorFerroviario.emitirPassagem("Leonardo", 500.00);
    }
}
