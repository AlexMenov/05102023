package com.example.javainterview.controller;

import com.example.javainterview.dto.WordDto;
import com.example.javainterview.service.WordCounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping(path = "/api/words",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class WordCounterController {
    private final WordCounterService wordCounterService;

    @PostMapping
    public String getWord(@RequestBody WordDto word) {
        wordCounterService.printWord(word);
        return "успешно";
    }


}
