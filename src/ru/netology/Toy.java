package ru.netology;

public class Toy extends Thread {
    private volatile boolean toggle = false;
    static final double TOY_DELAY = 0.5;

    public boolean getToggleStatus() {
        return toggle;
    }

    public void changeToggleStatus() {
        toggle = !toggle;
    }

    @Override
    public void run() {
        do {
            if (!Thread.interrupted()) {
                if (getToggleStatus()) {
                    try {
                        Thread.sleep((int) TOY_DELAY * 1000);
                    } catch (InterruptedException e) {
                    }
                    changeToggleStatus();
                    System.out.println("Игрушка выключила тумблер");
                }
            } else
                return;
        }
        while (true);
    }
}