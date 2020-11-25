package com.nelioalves.mc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import com.nelioalves.mc.domain.Categoria;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Data
@Builder
@ToString
public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message = "Preenchimento obrigatório")
	@Length(min = 5, max = 80, message = "O tamanho deve ser entre 5 e 8 caracteres")
	private String nome;
	
}
