package Matriculas;

public class ChileMatriculaFactory implements MatriculaFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new BoletaEletronicaChile();
    }

    @Override
    public ProcessamentoPagamento criarPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteRUT();
    }
}
