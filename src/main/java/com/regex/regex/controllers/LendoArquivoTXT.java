package com.regex.regex.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.regex.regex.models.RegexModels;

@RestController
@RequestMapping("/teste")
public class LendoArquivoTXT {

	RegexModels arquivoModels;

	@PostMapping
	public String upload(@RequestParam("texto") MultipartFile arquivoTXT) throws IOException {

		byte[] arquivoByte = arquivoTXT.getBytes();

		String arquivoString = new String(arquivoByte, "UTF-8");
		
		String arquivoSeparado = arquivoString.replace(" ", ";");
		
//		String coluna1 = arquivoSeparado.matches(";");

		return arquivoSeparado;
	}
}
