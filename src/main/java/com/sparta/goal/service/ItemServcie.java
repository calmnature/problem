package com.sparta.goal.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.goal.dto.ItemRequestDto;
import com.sparta.goal.dto.ItemResponseDto;
import com.sparta.goal.dto.ItemSummaryResponseDto;
import com.sparta.goal.dto.JsonDto;
import com.sparta.goal.entity.Item;
import com.sparta.goal.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j(topic = "ItemService")
@RequiredArgsConstructor
public class ItemServcie {
    private final ItemRepository itemRepository;

    public ItemResponseDto createArticle(ItemRequestDto requestDto) {
        Item item = itemRepository.save(new Item(requestDto));
        return new ItemResponseDto(item);
    }

    public List<ItemSummaryResponseDto> articleList() {
        List<Item> list = itemRepository.findAll();
        return list.stream().map(ItemSummaryResponseDto::new).toList();
    }

    @Transactional
    public ItemResponseDto updateArticle(Long id, ItemRequestDto requestDto) {
        Item item = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 ID가 존재하지 않아 수정에 실패하였습니다."));
        item.patch(requestDto);
        return new ItemResponseDto(item);
    }

    public JsonDto deleteArticle(Long id) throws JsonProcessingException {
        Item item = itemRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당하는 ID가 존재하지 않아 삭제에 실패하엿습니다."));
        itemRepository.delete(item);
        JsonDto jsonDto = new JsonDto("삭제 완료");
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.
        return jsonDto;

    }
}
