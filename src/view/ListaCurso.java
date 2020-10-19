package view;

import javax.swing.JOptionPane;

public class ListaCurso {
	private NO inicio;
	
	public ListaCurso() {
		inicio =null;
	}
	
	
	public  Curso cadastra() {
		Curso curso = new Curso();
		curso.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o Id do curso")));
		curso.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
		curso.setAreaCurso(JOptionPane.showInputDialog("Digite a área do curso"));
		curso.setQuantidadeSemestre(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de semestres")));
		curso.setPeriodo(JOptionPane.showInputDialog("Digite o período"));
		return curso;
	}

	public void addTopo(Curso curso){
		if (inicio==null){
			NO n=new NO(curso);
			inicio=n;
		}
		else{
			NO aux=inicio;
			while(aux.prox!=null){
				aux=aux.prox;
			}
			NO n=new NO(curso);
			aux.prox=n;
		}
	}
	
	
	public Curso removeTopo(){
		Curso r = null;
		if (inicio==null){
			System.out.println("Pilha Vázia");
		}
		else{
			if (inicio.prox==null){
				r=inicio.curso;
				inicio=null;
			}
			else{
				NO aux1=inicio;
				NO aux2=inicio;

				while(aux1.prox!=null){
					aux2=aux1;
					aux1=aux1.prox;
				}

				r=aux1.curso;
				aux2.prox=null;
			}
		}
		return r;
	}

	
	public String percorre(){
		NO aux=inicio;
		String r=" ";
		while(aux!=null){
			r=r+"\n"+aux.curso;
			aux=aux.prox;
		}
		return r;
	}
}
