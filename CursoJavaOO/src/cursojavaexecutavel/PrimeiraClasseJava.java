package cursojavaexecutavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojavaexecutavel.classes.Aluno;
import cursojavaexecutavel.classes.Disciplina;
import cursojavaexecutavel.constantes.StatusAluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");	
		
		if(login.equalsIgnoreCase("admin") && 
				senha.equalsIgnoreCase("admin")) {
			
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*E uma lista que dentro temos uma chave que indentifica  uma sequencia de valores tambem*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>> ();
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade do aluno?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
			 * String registroGeral = JOptionPane.showInputDialog("Qual o numero do RG:");
			 * String numeroCpf = JOptionPane.showInputDialog("Qual o numero do CPF: ");
			 * String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?"); String
			 * nomePai = JOptionPane.showInputDialog("Qual o nome do Pai"); String
			 * nomeEscola = JOptionPane.showInputDialog("Nome da Escola?"); String
			 * dataMatricula = JOptionPane.showInputDialog("Data da matricula?"); String
			 * serieMatriculado = JOptionPane.showInputDialog("Serie matriculado(a)? ");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(numeroCpf);
			 * aluno1.setNomeMae(nomeMae); aluno1.setNomePai(nomePai);
			 * aluno1.setNomeEscola(nomeEscola); aluno1.setDataMatricula(dataMatricula);
			 * aluno1.setSerieMatriculado(serieMatriculado);
			 */

			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
				}
			}

			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {//separando as listas
			
			if(aluno.getAprovado1().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAprovado1().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else{
					maps.get(StatusAluno.REPROVADO).add(aluno);
				}
		}
            System.out.println("-----------Lista dos aprovados--------");
          for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
        	  System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAprovado1() + " com a media de = " + aluno.getMediaNota());
        	 
          }
          System.out.println("-----------Lista dos que estão em recuperação --------");
          for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
        	  System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAprovado1() + " com a media de = " + aluno.getMediaNota());
        	 
          }
          System.out.println("-----------Lista dos reprovados--------");
          for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
        	  System.out.println("Aluno = " + aluno.getNome() + " Resultado = " + aluno.getAprovado1() + " com a media de = " + aluno.getMediaNota());
        	 
          }
		}
	}
}
