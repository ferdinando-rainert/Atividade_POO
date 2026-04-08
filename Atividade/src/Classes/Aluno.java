package Classes;

public class Aluno {
	
	private String nome;
	private String disciplina;
	private double nota;
	private double media;
	
	public Aluno(String nome, String disciplina, double nota) {
		this.nome = nome;
		this.disciplina = disciplina;
		this.nota = nota;
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

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = validaNota(nota);
	}
	
	public double getMedia() {
		return media/3;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public double validaNota(double nota) {
		
		if(nota > 10){
			
			nota = 10;
			
		}else if(nota < 0){
			
			nota = 0;
		}
		
		return nota;
	}

	public void info() {
		System.out.println("Nome do aluno: " + getNome());
		System.out.println("Nome da disciplina: " + getDisciplina());
		System.out.println("Média final: " + getMedia());
	}
}
