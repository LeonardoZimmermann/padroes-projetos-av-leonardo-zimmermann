package Matriculas;

public class Main {
    public static void main(String[] args) {

        MatriculaFactory fabricaBrasil = new BrasilMatriculaFactory();
        Matricula matriculaBrasil = new Matricula(fabricaBrasil);
        matriculaBrasil.confirmarMatricula();

        MatriculaFactory fabricaChile = new ChileMatriculaFactory();
        Matricula matriculaChile = new Matricula(fabricaChile);
        matriculaChile.confirmarMatricula();
    }
}
