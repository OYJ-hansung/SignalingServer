package com.example.interback_be.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TestSession {


    private String id;
    private String sessionId;

    public TestSession(String id, String sessionId) {
        this.id = id;
        this.sessionId = sessionId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getId() {
        return id;
    }

    public String getSessionId() {
        return sessionId;
    }
}
