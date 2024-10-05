package ru.vsu.shegoleva;
abstract class ServiceRequest {
    private int requestId;
    private String description;

    public ServiceRequest(int requestId, String description) {
        this.requestId = requestId;
        this.description = description;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Заявка(ID: " + requestId + ", Описание проблемы: " + description + ")";
    }
}