package org.example;

public class Person {
    String name;
    Integer age;
    Boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    // Setter for age
    public void setAge(Integer age) {
        this.age = age;
    }


    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Person(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + ",Age: " + age + ", Gender: " + (gender ? "Male" : "Female");
    }
}
