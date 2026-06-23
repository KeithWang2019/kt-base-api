package com.cangsg.brick.kt.base.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KtKeyValue<T> {
    private String key;
    private T value;

    public KtKeyValue(String key, T value) {
        this.key = key;
        this.value = value;
    }
}
