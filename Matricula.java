package Matriculas;

public class Matricula {

    private MatriculaFactory factory;

    private DocumentoFiscal documentoFiscal;
    private ProcessamentoPagamento pagamento;
    private ComprovanteMatricula comprovante;

    public Matricula(MatriculaFactory fabrica) {
        this.factory = fabrica;
    }

    public void confirmarMatricula() {
        documentoFiscal = factory.criarDocumentoFiscal();
        pagamento = factory.criarPagamento();
        comprovante = factory.criarComprovante();

        System.out.println("===== RELATÓRIO DA MATRÍCULA =====");
        System.out.println("Documento fiscal: " + documentoFiscal.getDescricao());
        System.out.println("Pagamento: " + pagamento.getDescricao());
        System.out.println("Comprovante: " + comprovante.getDescricao());
        System.out.println();
    }
}
