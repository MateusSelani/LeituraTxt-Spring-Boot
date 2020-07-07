package com.regex.regex.controllers;

import java.io.IOException;

import org.springframework.core.io.Resource;
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
	public Resource upload(@RequestParam("texto") MultipartFile arquivoTXT) throws IOException {

		return arquivoTXT.getResource();
	}
}
