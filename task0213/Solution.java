package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman women = new Woman();
        cat.owner = women;
        dog.owner = women;
        fish.owner = women;
        
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
