package ru.job4j.profession;
public class Builder extends  Engineer {
    private int numberFloors;
    public void  setNumberFloors(int numberFloors1) {
        this.numberFloors = numberFloors1;
    }
    public String buildHouse(Customer customer) {
        return customer + " ordered the number of floors : " + numberFloors;
    }
}
