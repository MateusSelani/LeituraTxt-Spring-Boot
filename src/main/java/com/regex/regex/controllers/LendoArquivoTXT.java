package com.regex.regex.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.regex.regex.models.RegexModels;

@RestController
@RequestMapping("/teste")
public class LendoArquivoTXT {

//	@Autowired
	RegexModels arquivoModels;

	@PostMapping
	public String upload(@RequestParam("texto") MultipartFile arquivoTXT) throws IOException {

//		Trazendo arquivo TXT - Retorno MultipartFile é byte[]
		byte[] arquivoByte = arquivoTXT.getBytes();

//		Transformando arquivo em String
		String arquivoString = new String(arquivoByte, "UTF-8");
		
//		Linhas para extrair colunas
		String sentenca = arquivoString.replaceAll("\\r", ";");
		
//		Coluna 1 do arquivo
		String coluna1 = sentenca.replaceAll("\\s\\d+\\s\\d{4}-\\d{2}-\\d{2}\\s\\d{2}:\\d{2}:\\d{2}\\s[A-Z,a-z,0-9]+\\s.*;\\n", ";");
//		RegexModels.builder().descricao(coluna1).build();
		
		return coluna1;
	}
	
}
