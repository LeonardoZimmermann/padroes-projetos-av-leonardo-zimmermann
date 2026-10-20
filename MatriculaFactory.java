package Matriculas;

public interface MatriculaFactory {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessamentoPagamento criarPagamento();
    ComprovanteMatricula criarComprovante();
}
