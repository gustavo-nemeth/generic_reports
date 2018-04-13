package br.com.sattra.generic_relatory;

import java.util.ArrayList;
import java.util.List;

import br.com.sattra.generic_relatory.model.ListaCollection;

public class App {
	public static void main(String[] args) {

		// Crie um List com qualquer tipo de objeto
		List<Object> list = new ArrayList<Object>();

		List<String> sublista = new ArrayList<String>();
		sublista.add("ONE");
		sublista.add("TWO");
		sublista.add("THREE");

		list.add(new QUALQUERCOISA(1, "um", sublista));
		list.add(new QUALQUERCOISA(2, "dois", sublista));
		list.add(new QUALQUERCOISA(3, "três", sublista));

		ListaCollection lc = new ListaCollection();
		lc.gerarRelatorio(list);

	}

	// Alterar classe para os atributos necessarios
	// O relatório não é gerado se não for criado todos os getters/setters
	public static class QUALQUERCOISA {
		int id;
		String nome;
		List<String> lista;

		public QUALQUERCOISA(int id, String nome, List<String> lista) {
			this.id = id;
			this.nome = nome;
			this.lista = lista;

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

		public List<String> getLista() {
			return lista;
		}

		public void setLista(List<String> lista) {
			this.lista = lista;
		}

	}

}
