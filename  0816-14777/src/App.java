public class App {
    public static void main(String[] args) throws Exception {
        Professor professor;
        Turma turma;
        Aluno aluno1;
        Aluno aluno2;
        Aluno aluno3;

        professor = new Professor(676767, "Goncalo", "Serra", 2010, "Programação");

        turma = new Turma("Aos56635", "Garotos de programa", 2026, 2028);

        aluno1 = new Aluno("adas89AA0", "Goncalo", "Serra", 2010, turma);
        aluno2 = new Aluno("ioifo525", "Giovani", "Trindade", 1800, turma);
        aluno3 = new Aluno("dfhs8842", "Salvador", "Sacadura", 2007,turma);

        System.out.println(professor.getNomeCompleto());

        System.out.println(turma.getInfoTurma());

        System.out.println(aluno1.getNomeCompleto());
        System.out.println(aluno1.getIdade());

        System.out.println(aluno2.getNomeCompleto());
        System.out.println(aluno2.getIdade());

        System.out.println(aluno3.getNomeCompleto());
        System.out.println(aluno3.getIdade());
        


    }
}
