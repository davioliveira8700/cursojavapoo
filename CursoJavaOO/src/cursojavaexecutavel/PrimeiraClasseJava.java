package cursojavaexecutavel;

import javax.swing.JOptionPane;

import cursojavaexecutavel.classes.Aluno;

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
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1:");
		String nota1 = JOptionPane.showInputDialog("Nota 1:");
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2:");
		String nota2 = JOptionPane.showInputDialog("Nota 2:");
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3:");
		String nota3 = JOptionPane.showInputDialog("Nota 3:");
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4:");
		String nota4 = JOptionPane.showInputDialog("Nota 4:");
		
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
		aluno1.setDisciplina1(disciplina1);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setDisciplina2(disciplina2);
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setDisciplina3(disciplina3);
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setDisciplina4(disciplina4);
		aluno1.setNota4(Double.parseDouble(nota4));
		
		
		System.out.println(aluno1.toString());
		System.out.println("Media do Aluno " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAprovado()?"Aprovado":"Reprovado"));
		
	
		

	
	}

}
