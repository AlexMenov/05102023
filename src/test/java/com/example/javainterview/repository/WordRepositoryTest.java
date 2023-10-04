package com.example.javainterview.repository;

import com.example.javainterview.dto.WordDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordRepositoryTest {

    // given
    // when
    // then
    @Test
    void addWord() {
        final WordRepository wordRepository = new WordRepository();
        var test = new WordDto("Alex");
        wordRepository.addWord(test);
        wordRepository.addWord(test);
        var result = wordRepository.gerWordQuantity(test);
        assertEquals(2L, result);
    }

    @Test
    void gerWordQuantity() {
    }
}