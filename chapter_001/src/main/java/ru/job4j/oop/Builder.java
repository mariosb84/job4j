package ru.job4j.oop;


public class Builder extends Engineer {
    private int estimate;
    private float coefficient;
    public Builder(int value, float value1) {
    this.estimate = value;
    this.coefficient = value1;
    }
    public float calculateEstimate(Customer customer) {
    return this.coefficient *  (float) customer.getCustomerEstimate();
}

    public static void main(String[] args) {
        Builder builder = new Builder(1000, 1.5f);
        Customer customer = new Customer(5000000);
        System.out.println("Смета от строителя : " + builder.calculateEstimate(customer));
        customer.showCustomerEstimate();
        System.out.println();
        builder.setName("Иван");
        builder.setSurname("Иванов");
        builder.setEducation("Высшее");
        builder.setBirthday("15.05.1989");
        builder.setSalary("100000 руб.");
        builder.setTechnicalSpecification("Постройка дома");
        System.out.println(builder.getName());
        System.out.println(builder.getSurname());
        System.out.println(builder.getEducation());
        System.out.println(builder.getBirthday());
        System.out.println(builder.getSalary());
        System.out.println(builder.getTechnicalSpecification());
    }

}
