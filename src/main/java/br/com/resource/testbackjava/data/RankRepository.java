package br.com.resource.testbackjava.data;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

public interface RankRepository extends CassandraRepository<Rank, String>{

	@Query("select * from RANK where descricao=?0 allow filtering")
	public List<Rank> listarCategoriasUtilizadasPorDescricao(String descricao);

}
