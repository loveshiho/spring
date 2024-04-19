package com.akai.pojo;

public class Cat {
    private String name;
    private Mouse mouse;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", mouse=" + mouse +
                '}';
    }

    public Cat() {
    }

    public Cat(String name, Mouse mouse) {
        this.name = name;
        this.mouse = mouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}