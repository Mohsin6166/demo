package net.javaguides.springbootbackend.model;

import org.springframework.stereotype.Service;

@Service
public class Meta {
    private String status = "200";
    private String code = "200";
    private String message = "Success";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
