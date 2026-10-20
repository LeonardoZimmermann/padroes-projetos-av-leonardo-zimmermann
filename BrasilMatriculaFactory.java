package Matriculas;

public class BrasilMatriculaFactory implements MatriculaFactory {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new NFSeBrasil();
    }

    @Override
    public ProcessamentoPagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public ComprovanteMatricula criarComprovante() {
        return new ComprovanteCPF();
    }
}
