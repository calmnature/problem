package com.sparta.goal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.sparta.goal.dto.ItemRequestDto;
import com.sparta.goal.dto.ItemResponseDto;
import com.sparta.goal.dto.ItemSummaryResponseDto;
import com.sparta.goal.dto.JsonDto;
import com.sparta.goal.service.ItemServcie;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j(topic = "ItemController")
@RequiredArgsConstructor
public class ItemController {
    private final ItemServcie itemServcie;

    @PostMapping("/post")
    public ItemResponseDto createArticle(@RequestBody ItemRequestDto requestDto){
        return itemServcie.createArticle(requestDto);
    }

    @GetMapping("/post")
    public List<ItemSummaryResponseDto> articleList(){
        return itemServcie.articleList();
    }

    @PutMapping("/post/{id}")
    public ItemResponseDto updateArticle(@PathVariable Long id, @RequestBody ItemRequestDto requestDto){
        return itemServcie.updateArticle(id, requestDto);
    }

    @DeleteMapping("/post/{id}")
    public JsonDto deleteArticle(@PathVariable Long id) throws JsonProcessingException {
        return itemServcie.deleteArticle(id);
    }
}
