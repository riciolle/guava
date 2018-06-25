package br.com.guava.api.guava.repository.projection;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.guava.api.guava.enums.TipoLancamentoEnum;

public class ResumoLancamento {

	private Long codigo;

	private String descricao;

	private LocalDate dataVencimento;

	private LocalDate dataPagamento;

	private BigDecimal valor;

	private TipoLancamentoEnum tipoLancamento;

	private String categoria;

	private String pessoa;

	public ResumoLancamento( Long codigo, String descricao, LocalDate dataVencimento, LocalDate dataPagamento, BigDecimal valor, TipoLancamentoEnum tipoLancamento, String categoria, String pessoa ) {

		this.codigo = codigo;
		this.descricao = descricao;
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		this.tipoLancamento = tipoLancamento;
		this.categoria = categoria;
		this.pessoa = pessoa;
	}

	public Long getCodigo() {

		return codigo;
	}

	public void setCodigo(Long codigo) {

		this.codigo = codigo;
	}

	public String getDescricao() {

		return descricao;
	}

	public void setDescricao(String descricao) {

		this.descricao = descricao;
	}

	public LocalDate getDataVencimento() {

		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {

		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDataPagamento() {

		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {

		this.dataPagamento = dataPagamento;
	}

	public BigDecimal getValor() {

		return valor;
	}

	public void setValor(BigDecimal valor) {

		this.valor = valor;
	}

	public TipoLancamentoEnum getTipoLancamento() {

		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamentoEnum tipoLancamento) {

		this.tipoLancamento = tipoLancamento;
	}

	public String getCategoria() {

		return categoria;
	}

	public void setCategoria(String categoria) {

		this.categoria = categoria;
	}

	public String getPessoa() {

		return pessoa;
	}

	public void setPessoa(String pessoa) {

		this.pessoa = pessoa;
	}

}
