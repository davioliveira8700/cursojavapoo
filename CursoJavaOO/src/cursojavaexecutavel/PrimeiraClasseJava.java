package cursojavaexecutavel;

import javax.swing.JOptionPane;

import cursojavaexecutavel.classes.Aluno;
import cursojavaexecutavel.classes.Disciplina;


public class PrimeiraClasseJava {
	
	public static void main(String [] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o numero do RG:");
		String numeroCpf = JOptionPane.showInputDialog("Qual o numero do CPF: ");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do Pai");
		String nomeEscola = JOptionPane.showInputDialog("Nome da Escola?");
		String dataMatricula = JOptionPane.showInputDialog("Data da matricula?");
		String serieMatriculado = JOptionPane.showInputDialog("Serie matriculado(a)? ");

		
		Aluno aluno1 = new Aluno();
		
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatriculado);
	
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		
		aluno1.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		
		aluno1.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(65);
		
		aluno1.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);
		
		aluno1.getDisciplinas().add(disciplina4);
		
		
		
		
		
		System.out.println(aluno1.toString());
		System.out.println("Media do Aluno " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAprovado()?"Aprovado":"Reprovado"));
		
	
		

	
	}

}
