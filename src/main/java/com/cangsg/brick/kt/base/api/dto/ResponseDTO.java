package com.cangsg.brick.kt.base.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDTO<T> {
    private boolean success;
    private int code;
    private String message;
    private T body;

    public ResponseDTO() {

    }

    public ResponseDTO(T body) {
        this.success = true;
        this.code = 0;
        this.message = null;
        this.body = body;
    }

    public ResponseDTO(boolean success, int code, String message, T body) {
        this.success = success;
        this.code = 0;
        this.message = message;
        this.body = body;
    }

    // ==================== 静态快捷方法（推荐使用，简化调用）====================
    /**
     * 成功响应（无响应体）
     */
    public static <T> ResponseDTO<T> success() {
        return new ResponseDTO<>(true, 0, "", null);
    }

    /**
     * 成功响应（带响应体）
     */
    public static <T> ResponseDTO<T> success(T body) {
        return new ResponseDTO<>(body);
    }

    /**
     * 成功响应（带响应体+自定义消息）
     */
    public static <T> ResponseDTO<T> success(T body, String message) {
        return new ResponseDTO<>(true, 0, message, body);
    }

    /**
     * 失败响应（自定义错误码+错误信息）
     */
    public static <T> ResponseDTO<T> fail(int code, String message) {
        return new ResponseDTO<>(false, code, message, null);
    }

    /**
     * 失败响应（自定义错误码+错误信息+响应体）
     */
    public static <T> ResponseDTO<T> fail(int code, String message, T body) {
        return new ResponseDTO<>(false, code, message, body);
    }
}
