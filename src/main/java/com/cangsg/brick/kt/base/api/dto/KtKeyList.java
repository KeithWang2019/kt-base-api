package com.cangsg.brick.kt.base.api.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KtKeyList<T> {
    private String key;
    private List<T> value;

    public KtKeyList(String key, List<T> value) {
        this.key = key;
        this.value = value;
    }
    
}
