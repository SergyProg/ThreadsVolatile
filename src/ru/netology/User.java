package ru.netology;

public class User extends Thread {
    static final int MAX_ITERATION = 3;
    static final double USER_DELAY = 2.5;
    private Toy toy;

    public void setToy(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        for (int i = 0; i < MAX_ITERATION; i++) {
            if (!toy.getToggleStatus()) {
                try {
                    Thread.sleep((int) USER_DELAY * 1000);
                } catch (InterruptedException e) {
                }
                toy.changeToggleStatus();
                System.out.println("Пользователь включил тумблер");
            }
        }
    }
}
