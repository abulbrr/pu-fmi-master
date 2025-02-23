package org.example.server.contracts;

public enum HttpStatusCodeEnum {

    OK(200), NOT_FOUND(404), CREATED(201), FORBIDDEN(403);

    private int value;

    HttpStatusCodeEnum(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
