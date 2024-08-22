package recuperacao;

public class Principal {
public static void main(String[] args) {
	
	 ColecaoAlunoArray AlunoArray = new ColecaoAlunoArray();
	 
     AlunoArray.cadastrarAluno(new Aluno("Micaelly", "22221144", 17, "informática"));
     AlunoArray.cadastrarAluno(new Aluno("Cauenia", "2223111", 15,"Informática"));
     AlunoArray.cadastrarAluno(new Aluno("Mirelly", "22281234", 17,"Informática"));

     AlunoArray.listarAluno();

     System.out.println("Procurando aluno por posição :");
     System.out.println(AlunoArray.procurarAlunoPorPosicao("2"));

     AlunoArray.excluirPorPosicao(0, null);
     AlunoArray.listarAluno();

     ColecaoAluno AlunoArrayList = new ColecaoAluno();
     AlunoArrayList.cadastrarAlunoArray(new Aluno("Geane", "3223232322", 17,"ELETROMECANICA"));
     AlunoArrayList.cadastrarAlunoArray(new Aluno("Ana", "6663677333", 18,"ELETROMECANICA"));
     AlunoArrayList.cadastrarAlunoArray(new Aluno("Ana", "453456435", 17,"ELETROMECANICA"));

     AlunoArrayList.listarAlunoArray();

     System.out.println("Procurando aluno por posição :");
     System.out.println(AlunoArray.procurarAlunoPorPosicao("0"));

     AlunoArrayList.excuirAlunoPorPosicaoArray(2);
     AlunoArrayList.listarAlunoArray();
 }
}


