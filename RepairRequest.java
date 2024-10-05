package ru.vsu.shegoleva;

class RepairRequest extends ServiceRequest {
    private Client client;
    private Car car;

    public RepairRequest(int requestId, Client client, Car car, String description) {
        super(requestId, description);
        this.client = client;
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return "Заявка(ID: " + getRequestId() + ", Клиент: " + client.getName() + ", " +
                "Автомобиль: " + car.getMake() + ',' + car.getYear() + ',' + " Описание проблемы: " + getDescription() + ")";
    }
}