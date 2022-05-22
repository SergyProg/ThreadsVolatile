package ru.netology;

public class Main {
    private static User user;
    private static Toy toy;

    public static void main(String[] args) {
        user = new User();
        toy = new Toy();
        user.setToy(toy);

        user.start();
        toy.start();

        try {
            user.join();
        } catch (InterruptedException e) {
        }
        toy.interrupt();
    }
}
