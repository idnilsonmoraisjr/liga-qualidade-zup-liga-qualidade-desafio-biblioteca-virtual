package br.com.zup.edu.ligaqualidade.desafiobiblioteca.modifique;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosDevolucao;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.DadosEmprestimo;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.EmprestimoConcedido;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosLivro;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.DadosUsuario;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoExemplar;
import br.com.zup.edu.ligaqualidade.desafiobiblioteca.pronto.TipoUsuario;

public class Solucao {

	/**
	 * Você precisa implementar o código para executar o fluxo
	 * o completo de empréstimo e devoluções a partir dos dados
	 * que chegam como argumento. 
	 * 
	 * Caso você queira pode adicionar coisas nas classes que já existem,
	 * mas não pode alterar nada.
	 */
	
	/**
	 * 
	 * @param livros dados necessários dos livros
	 * @param exemplares tipos de exemplares para cada livro
	 * @param usuarios tipos de usuarios
	 * @param emprestimos informações de pedidos de empréstimos
	 * @param devolucoes informações de devoluções, caso exista. 
	 * @param dataParaSerConsideradaNaExpiracao aqui é a data que deve ser utilizada para verificar expiração
	 * @return
	 */
	public static void validaExemplar(DadosExemplar exemplar) {
		
		if(exemplar.tipo.equals(TipoExemplar.RESTRITO)) {
				
		}
	}
	
	public static Set<EmprestimoConcedido> executa(Set<DadosLivro> livros,
			Set<DadosExemplar> exemplares,
			Set<DadosUsuario> usuarios, Set<DadosEmprestimo> emprestimos,
			Set<DadosDevolucao> devolucoes, LocalDate dataParaSerConsideradaNaExpiracao) {

		exemplares.forEach(exemplar -> validaExemplar(exemplar));
		
		return Set.of();
	}

}
