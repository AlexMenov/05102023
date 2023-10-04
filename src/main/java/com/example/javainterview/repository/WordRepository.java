package com.example.javainterview.repository;

import com.example.javainterview.dto.WordDto;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Repository
public class WordRepository {
    private final Map<String, Long> uniqueWord = new ConcurrentHashMap<>();

    public void addWord (WordDto wordDto) {
        synchronized (uniqueWord) {
            if (uniqueWord.containsKey(wordDto.word())) {
                var res = uniqueWord.get(wordDto.word());
                uniqueWord.put(wordDto.word(), ++res);
            } else {
                uniqueWord.put(wordDto.word(), 1L);
            }
        }
    }
    public Long gerWordQuantity (WordDto wordDto) {
        return uniqueWord.get(wordDto.word());
    }
}
