package com.lojagames.LojaGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojagames.LojaGames.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>  {
	public List<ProdutoModel> findAllByProdutoContainingIgnoreCase(String produto);

}
