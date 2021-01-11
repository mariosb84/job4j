package ru.job4j.stream;

public class Animal {
    private String nickname;
    private String breed;
    private byte age;
    private byte weight;
    private byte height;
    private boolean healthy;
    private String gender;

    public Animal(String nickname, String breed, byte age, byte weight,
                  byte height, boolean healthy, String gender) {
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.healthy = healthy;
        this.gender = gender;
    }
    static class Builder {

        private String nickname;
        private String breed;
        private byte age;
        private byte weight;
        private byte height;
        private boolean healthy;
        private String gender;

        Builder buildNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        Builder buildBreed(String breed) {
            this.breed = breed;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildWeight(byte weight) {
            this.weight = weight;
            return this;
        }

        Builder buildHeight(byte height) {
            this.height = height;
            return this;
        }

        Builder buildHealthy(boolean healthy) {
            this.healthy = healthy;
            return this;
        }

        Builder buildGender(String gender) {
            this.gender = gender;
            return this;
        }

        Animal build() {
            Animal animal = new Animal(nickname, breed, age, weight, height, healthy, gender);
            animal.nickname = nickname;
            animal.breed = breed;
            animal.age = age;
            animal.weight = weight;
            animal.height = height;
            animal.healthy = healthy;
            animal.gender = gender;
            return animal;
        }
    }



    public static void main(String[] args) {
        Animal animal = new Builder().buildNickname("name")
                .buildBreed("breed")
                //.buildAge((byte) 3)                                    // Шаблон "Строитель - можем использовать не все поля"
                //.buildWeight((byte) 5)
                //.buildHeight((byte) 30)
                .buildHealthy(true)
                .buildGender("male")
                .build();
        System.out.println(animal);
    }
}
