package com.nartkoc.oidcdemo.controller;

import com.nartkoc.oidcdemo.entity.Language;
import com.nartkoc.oidcdemo.repository.LanguageRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class LanguageController {

	private final LanguageRepository languageRepository;

	public LanguageController(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@GetMapping("/language")
	public ResponseEntity<List<Language>> getAllLanguage() {

		List<Language> allLanguage = languageRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(allLanguage);

	}

}
