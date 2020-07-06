package com.regex.regex.controllers;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/teste")
public class LendoArquivoTXT {

	MultipartFile arquivoTXT;

	@PostMapping
	public byte[] upload(@RequestParam("texto") MultipartFile arquivoTXT) throws IOException {

		return arquivoTXT.getBytes();
	}
}
