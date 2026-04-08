package Classes;

public class Aluno {
	
	private String nome;
	private String disciplina;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Aluno(String nome, String disciplina, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getMedia() {
		return (getNota1() + getNota2() + getNota3())/3;
	}

	
	public void info() {
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Nome da disciplina: " + getDisciplina());
		System.out.println("Média final: " + getMedia());
	}
}
