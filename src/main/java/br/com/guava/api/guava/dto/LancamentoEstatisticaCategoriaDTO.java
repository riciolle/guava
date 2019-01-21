package br.com.guava.api.guava.dto;

import java.math.BigDecimal;

import br.com.guava.api.guava.entity.Categoria;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class LancamentoEstatisticaCategoriaDTO {

	private Categoria categoria;
	
	private BigDecimal total;
	
	public LancamentoEstatisticaCategoriaDTO(Categoria categoria, BigDecimal total) {
		this.categoria = categoria;
		this.total = total;
	}
	
}
