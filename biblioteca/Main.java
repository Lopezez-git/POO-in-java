package Biblioteca;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int escolha1 = -1, escolha2 = -1;

		String nome, pais, cidade, autor, genero;

		Biblioteca biblio = new Biblioteca();

		while (escolha1 != 4) {

			escolha1 = Integer.parseInt(JOptionPane.showInputDialog(
					"Seja bem vindo(a) a BiblioLopes\n1 - Autores\n2 - Livros\n3 - Sair"));

			switch (escolha1) {
			case 1:

				escolha2 = Integer.parseInt(
						JOptionPane.showInputDialog("1 - Adicionar Autores\n2 - Mostrar Autores\n3 - Voltar"));

				if (escolha2 == 1) {

					nome = JOptionPane.showInputDialog("Qual é o nome do autor?");

					pais = JOptionPane.showInputDialog("Qual é o país do autor?");

					cidade = JOptionPane.showInputDialog("Qual é a cidade do autor?");

					Autor novoAutor = new Autor(nome, pais, cidade);

					biblio.addAutor(novoAutor);

				} else if (escolha2 == 2) {

					biblio.showAllAutor();
				}

				break;

			case 2:

				escolha2 = Integer
						.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livros\n2 - Mostrar Livros\n3 - Buscar livro\n 4 - Sair"));

				if (escolha2 == 1) {

					nome = JOptionPane.showInputDialog("Qual é o nome do livro?");

					autor = JOptionPane.showInputDialog("Qual é o autor do livro?");

					genero = JOptionPane.showInputDialog("Qual é o genero do livro?");

					if (biblio.verificaAutor(autor) == null) {

						JOptionPane.showMessageDialog(null, "Autor não encontrado :P");

						break;
					} else {

						Livro novoLivro = new Livro(nome, biblio.verificaAutor(autor), genero);

						biblio.addLivro(novoLivro);
					}

				} else if (escolha2 == 2) {

					biblio.showAllLivro();
				}
				else if(escolha2 == 3) {
					
					String livro = JOptionPane.showInputDialog("Qual é o nome do livro");
					
					biblio.buscaLivro(livro);
					
					JOptionPane.showMessageDialog(null, biblio.buscaLivro(livro));
				}

				break;


			case 3:

				JOptionPane.showMessageDialog(null, "Saindo...");

				System.exit(0);

				break;

			default:

				JOptionPane.showMessageDialog(null, "Digite uma opção valida!");
				break;
			}

		}
	}
}
