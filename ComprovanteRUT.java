package Matriculas;

public class ComprovanteRUT implements ComprovanteMatricula {
    @Override
    public String getDescricao() {
        return "Comprovante de matrícula com identificação do aluno por RUT";
    }
}
