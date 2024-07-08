package com.sparta.goal.controller;

import com.sparta.goal.service.ItemServcie;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j(topic = "ItemController")
@RequiredArgsConstructor
public class ItemController {
    private final ItemServcie itemServcie;

}
