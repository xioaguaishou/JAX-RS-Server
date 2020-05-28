package com.cxf.lam.vo;

import org.springframework.http.HttpStatus;

import java.util.List;

public class Result<T> {

    private HttpStatus status;
    private String message;
    private T t;
    private List<T> items;

    public Result() {
    }

    public Result(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(HttpStatus status, T t) {
        this.status = status;
        this.t = t;
    }

    public Result(HttpStatus status, List<T> items) {
        this.status = status;
        this.items = items;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", t=" + t +
                ", items=" + items +
                '}';
    }
}
