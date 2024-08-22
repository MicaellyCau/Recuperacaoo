package recuperacao;

import java.util.ArrayList;

public class ColecaoAluno {
private ArrayList<Aluno>a = new ArrayList();

public ColecaoAluno() {

}

public ColecaoAluno(ArrayList<Aluno> a) {
	this.a = a;
}

public ArrayList<Aluno> getA() {
	return a;
}

public void setA(ArrayList<Aluno> a) {
	this.a = a;
}


public void cadastrarAlunoArray(Aluno aluno) {
    a.add(aluno);
}

public void cadastrarAlunoPorPosicaoArray(int posicao, Aluno aluno) {
	if (posicao<=a.size() && posicao >= 0) {
		 a.add(posicao, aluno);
		}
		
	} 
public void excuirAlunoPorPosicaoArray(int posicao){
	 if (posicao<a.size()  && posicao>= 0) {
         a.remove(posicao);
}
}
public void listarAlunoArray() {
    for (Aluno alunos : a) {
        System.out.println(alunos);
    }
}

public Aluno procurarAlunoPorPosicaoArray(String posicao) {
	for (Aluno alunos : a) {
		if (alunos != null && alunos.getNome().equalsIgnoreCase(posicao)) {
			return alunos;
		}
	}
	return null;
}
}
