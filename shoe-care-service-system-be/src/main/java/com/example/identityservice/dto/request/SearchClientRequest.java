package com.example.identityservice.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class SearchClientRequest extends PaginationRequest {
    String keyWord;
    Long clientCategoryId;

    public void validateInput(){
        super.validateInput();
        if(keyWord != null)
            keyWord = keyWord.trim().toLowerCase();
    }
}