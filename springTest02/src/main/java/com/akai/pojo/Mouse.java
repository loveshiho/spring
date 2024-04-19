package com.akai.pojo;

import java.util.Date;

public class Mouse {
    private String name;
    private Date brithDay;

    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + name + '\'' +
                ", brithDay=" + brithDay +
                '}';
    }

    public Mouse() {
    }

    public Mouse(String name, Date brithDay) {
        this.name = name;
        this.brithDay = brithDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrithDay(Date brithDay) {
        this.brithDay = brithDay;
    }
}
