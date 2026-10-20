package Matriculas;

public class ComprovanteCPF implements ComprovanteMatricula {
    @Override
    public String getDescricao() {
        return "Comprovante de matrícula com identificação do aluno por CPF";
    }
}
