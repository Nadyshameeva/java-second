package ru.kemsu;

public class Balance {
    private double leftCargo;
    private double rightCargo;

    public void addRight(double cargo) {
        if (cargo <= 0) {
            System.out.println("Incorrect cargo weight");
            return;
        }

        this.rightCargo += cargo;
    }

    public void addLeft(double cargo) {
        if (cargo <= 0) {
            System.out.println("Incorrect cargo weight");
            return;
        }

        this.leftCargo += cargo;
    }

    public void result() {
        if (leftCargo > rightCargo)
            System.out.println("L");
        else if (leftCargo < rightCargo)
            System.out.println("R");
        else
            System.out.println("=");
    }

    public void clear() {
        this.leftCargo = 0;
        this.rightCargo = 0;
    }
}
