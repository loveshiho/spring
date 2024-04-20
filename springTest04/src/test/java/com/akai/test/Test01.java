package com.akai.test;

import org.junit.Test;

public class Test01 {
    @Test
    public void testCount() {
        Person p = new Person("cao");
        p.doCourt();
    }

    @Test
    public void testCount2() {
        Person p = new Person("cao");
        Court lawyer = new lawyer(p);
        lawyer.doCourt();
    }

    interface Court {
        void doCourt();
    }

    class lawyer implements Court {
        private Person person; // 组合一个 person

        public lawyer(Person person) {
            this.person = person;
        }

        @Override
        public void doCourt() {
            System.out.println("律师取证：视频证明cao没杀人！");
            person.doCourt();
        }
    }

    class Person implements Court {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public void doCourt() {
            System.out.println(name + "说：我没有杀人");
        }
    }
}
