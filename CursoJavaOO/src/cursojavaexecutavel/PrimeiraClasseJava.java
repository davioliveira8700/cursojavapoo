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
		String nota1 = JOptionPane.showInputDialog("Nota 1:");
		String nota2 = JOptionPane.showInputDialog("Nota 2:");
		String nota3 = JOptionPane.showInputDialog("Nota 3:");
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
		aluno1.setNota1(Integer.valueOf(nota1));
		aluno1.setNota2(Integer.valueOf(nota2));
		aluno1.setNota3(Integer.valueOf(nota3));
		aluno1.setNota4(Integer.valueOf(nota4));
		
		System.out.println("Nome do aluno 1 = " + aluno1.getNome());
		System.out.println("Idade = " + aluno1.getIdade() );
		System.out.println("Data de Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Media do Aluno " + aluno1.getNome() + " " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAprovado() ? "aprovado" : "Reprovado"));
	}

}
