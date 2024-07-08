package com.sparta.goal.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseItemDto {
    private Long id;
    private String title;
    private String contents;
    private int price;
    private String username;
}
