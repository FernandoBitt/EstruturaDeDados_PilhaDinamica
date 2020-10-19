package view;

public class Curso {
	private int id;
	private String nome;
	private String areaCurso;
	private int quantidadeSemestre;
	private String periodo;
	
	public Curso() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAreaCurso() {
		return areaCurso;
	}

	public void setAreaCurso(String areaCurso) {
		this.areaCurso = areaCurso;
	}

	public int getQuantidadeSemestre() {
		return quantidadeSemestre;
	}

	public void setQuantidadeSemestre(int quantidadeSemestre) {
		this.quantidadeSemestre = quantidadeSemestre;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Curso id=" + id + ", Nome=" + nome + ", Area do Curso=" + areaCurso + ", Quantidade de Semestre="
				+ quantidadeSemestre + ", Periodo=" + periodo;
	}
	
	
}
