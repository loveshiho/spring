package com.akai.test;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test02 {
    @Test
    public void testEat() {
        Dinner dinner = new Student("张三");
        // 通过Porxy动态代理获得一个代理对象,在代理对象中,对某个方法进行增强
        // Dinner dinnerProxy = Proxy.newProxyInstance();
        /*
         * ClassLoader loader,被代理的对象的类加载器
         * Class<?>[] interfaces,被代理对象所实现的所有接口
         * InvocationHandler handler,执行处理器对象,专门用于定义增强的规则,增强的策略
         * */
        ClassLoader classLoader = dinner.getClass().getClassLoader();
        Class[] interfaces = dinner.getClass().getInterfaces();
        // 这两步相对固定,比较有说法的是 InvocationHandler接口的实现,用于定义增强的规则
        InvocationHandler handler = new InvocationHandler() {
            @Override
            // invoke 当我们让代理对象调用任何方法时,都会触发invoke方法的执行
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // Object proxy, 代理对象
                // Method method,被代理的方法,你执行哪个方法,哪个方法就会被传入
                // Object[] args,被代理方法运行时的实参
                Object res = null;  // 用于接收方法的返回值
                if (method.getName().equals("eat")) {
                    System.out.println("饭前洗手");
                    // 让原有的eat的方法去运行
                    res = method.invoke(dinner, args);   // 先让被代理对象的方法执行一遍
                    System.out.println("饭后刷碗");
                } else {
                    // 如果是其他方法,我们不增强,那么正常执行就可以了
                    res = method.invoke(dinner, args);
                }
                return res;
            }
        };
        Dinner dinnerProxy = (Dinner) Proxy.newProxyInstance(classLoader, interfaces, handler);
        dinnerProxy.eat("包子");
        /*
        * 饭前洗手
        * 张三正在食堂吃:包子
        * 饭后刷碗
        * */
        dinnerProxy.drink();
        // 张三正在喝可乐
    }


    interface Dinner {
        void eat(String foodName);

        void drink();
    }

    class Person implements Dinner {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public void eat(String foodName) {
            System.out.println(name + "正在吃:" + foodName);
        }

        @Override
        public void drink() {
            System.out.println(name + "正在喝茶");
        }
    }

    class Student implements Dinner {
        private String name;

        public Student(String name) {
            this.name = name;
        }

        @Override
        public void eat(String foodName) {
            System.out.println(name + "正在食堂吃:" + foodName);
        }

        @Override
        public void drink() {
            System.out.println(name + "正在喝可乐");
        }
    }
}
