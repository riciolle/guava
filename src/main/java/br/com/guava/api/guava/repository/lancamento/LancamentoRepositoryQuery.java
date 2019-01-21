package br.com.guava.api.guava.repository.lancamento;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.guava.api.guava.dto.LancamentoEstatisticaCategoriaDTO;
import br.com.guava.api.guava.dto.LancamentoEstatisticaDiaDTO;
import br.com.guava.api.guava.entity.Lancamento;
import br.com.guava.api.guava.repository.filter.LancamentoFilter;
import br.com.guava.api.guava.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public List<LancamentoEstatisticaCategoriaDTO> porCategoria(LocalDate mesReferencia);
	public List<LancamentoEstatisticaDiaDTO> porDia(LocalDate mesReferencia);
	
	public Page<Lancamento> filter(LancamentoFilter lancamentoFilter,  Pageable pageable);
	public Page<ResumoLancamento> resume(LancamentoFilter lancamentoFilter,  Pageable pageable);
}
