package ru.prokudin.geekbrains.homework;

/**   Home Work Lesson 06
/* 1. Создать классы Собака и Кот с наследованием от класса Животное.
/* 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
/*    В качестве параметра каждому методу передается величина, означающая или длину препятствия
/*   (для бега и плавания), или высоту (для прыжков).
/* 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
      прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
/* 4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
/*   (Например, dog1.run(150); -> результат: run: true)
/* 5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.
*/
// Task #1
// Задаём супер класс, в который входят два подкласса Cat, Dog.
// Указываем здесь одинаковые для всех животных типы данных.
class Animal {

    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}

// Подкласс Cat, супер класса Animal, с наследованием extends
// с индивидуальными навыками(типами данных)
class Cat extends Animal {

    protected boolean swim;
    public int jump;

// Construction Kit, class: Cat

    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }

    // Вывод инфо в консоль
    public void catInfo() {
        System.out.println("Cat Name: " + name + " / Run Limit: " + run+ " m" + " / Swim Ability: " +
                swim + " /Jump Limit: " + jump + " m /");
    }
}

//***********************DOG****************************
// Подкласс Dog супер класса Animal с наследованием extends
class Dog extends Animal {

    public double jump;
    public int swim;

    //Construction Kit, class: Dog

    public Dog(String name, int run, int swim, double jump ) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("Dog Name: " + name  + " / Run Limit: " + run+ " m" + " / Swim Limit: " +
                swim + " m" + " / Jump Limit: " +jump+ " m /");
    }

}

public class Main {


    public static void main(String[] args) {

        Animal cat_animal = new Animal("Cats");
        Cat cat = new Cat("Барсик", 200, false, 2);
        cat_animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal dog_animal = new Animal("Dogs");
        Dog dog = new Dog("Шарик", 500, 10, 0.5);
        dog_animal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
