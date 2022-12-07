package com.assessment.ekos.util;public enum MessageUtil {    INVALID_JWT_TOKEN("Wrong JWT!!!", "invalid_jwt_token"),    USER_NOT_FOUND("User Not Found!!!", "user_not_found"),    EMAIL_ERROR("Email not Found!!", "email_cannot_find"),    PASSWORD_ERROR("Wrong Pass!!!", "password_validation_error");    private final String message;    private final String key;    MessageUtil(String message, String key) {        this.message = message;        this.key = key;    }    public String getMessage() {        return this.message;    }    public String getKey() {        return this.key;    }    @Override    public String toString() {        return message;    }}