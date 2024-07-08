package com.sparta.goal.service;

import com.sparta.goal.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j(topic = "ItemService")
@RequiredArgsConstructor
public class ItemServcie {
    private final ItemRepository itemRepository;
}
