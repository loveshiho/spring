package com.akai.test;

import org.junit.Test;

public class Test03 {
    @Test
    public void testCglib() {
        Person p = new son("cao");
        p.eat("shit");
    }
    class Person {
        private String pname;

        public Person(String pname) {
            this.pname = pname;
        }

        public void eat(String foodName) {
            System.out.println(pname + "吃" + foodName);
        }
    }
    class son extends Person {
        public son(String pname) {
            super(pname);
        }

        @Override
        public void eat(String foodName) {
            System.out.println("洗手");
            super.eat(foodName);
            System.out.println("刷碗");
        }
    }
}
