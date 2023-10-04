package com.example.javainterview.service;

import com.example.javainterview.dto.WordDto;
import org.springframework.stereotype.Service;

@Service
public class WordCounterService {
    public void printWord (WordDto word) {
        System.out.println(word);
    }
}
