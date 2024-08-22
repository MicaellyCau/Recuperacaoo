package recuperacao;

public class ColecaoAlunoArray {
	private Aluno[] alunos;
	private int totalAlunos;

	public ColecaoAlunoArray() {

	}

	public ColecaoAlunoArray(Aluno[] alunos, int totalAlunos) {
	
		this.alunos = alunos;
		this.totalAlunos = totalAlunos;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public int getTotalAlunos() {
		return totalAlunos;
	}

	public void setTotalAlunos(int totalAlunos) {
		this.totalAlunos = totalAlunos;
	}

	
	public void cadastrarAluno(Aluno alu) {
	
			alunos[totalAlunos] = alu;
		
		totalAlunos++;
	}

	public void cadastraPorPosicao(int posicao, Aluno alu) {
		if (posicao > this.totalAlunos || posicao < 0) {
			for (int cont = 0; cont < posicao - 1; cont++) {
				alunos[posicao] = alu;
			}
			totalAlunos++;
		}

	}

	public void excluirPorPosicao(int posicao, Aluno alu) {
		if (posicao == this.totalAlunos && posicao <=alunos.length) {
			for (int cont = 0; cont == posicao - 1; cont--) {
				alunos[totalAlunos-1] = alu;

			}
			totalAlunos--;

		}
	}

	public Aluno[] listarAluno() {
		return alunos;
	}

	public Aluno procurarAlunoPorPosicao(String i) {
		for (Aluno aluno : alunos) {
			if (aluno != null && aluno.getNome().equalsIgnoreCase(i)) {
				return aluno;
			}
		}
		return null;
	}

	
	

}
