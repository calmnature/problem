package com.sparta.goal.dto;

import com.sparta.goal.entity.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ItemSummaryResponseDto {
    private Long id;
    private String title;
    private int price;
    private String username;

    public ItemSummaryResponseDto(Item item) {
        this.id = item.getId();
        this.title = item.getTitle();
        this.price = item.getPrice();
        this.username = item.getUsername();
    }
}
