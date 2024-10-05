package ru.vsu.shegoleva;

class MaintenanceRequest extends ServiceRequest {
    private String equipmentType;

    public MaintenanceRequest(int requestId, String equipmentType, String description) {
        super(requestId, description);
        this.equipmentType = equipmentType;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    @Override
    public String toString() {
        return "Заявка(ID: " + getRequestId() + ", Тип оборудования: " + equipmentType + ", Описание проблемы: " + getDescription() + ")";
    }
}