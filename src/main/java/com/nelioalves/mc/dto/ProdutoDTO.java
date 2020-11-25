package com.nelioalves.mc.dto;

import java.io.Serializable;

import com.nelioalves.mc.domain.Produto;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ProdutoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Double preco;
	
	
}
