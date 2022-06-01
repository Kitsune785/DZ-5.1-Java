package ru.netology.sqr.DZ5.services;

public class SQRService {

    public int squareRoot(int minSQR, int maxSQR) {

        int counterTotal = 0;

        outer:
        for (int i = 10; i <= 99; i++) {
            if (i * i >= 99) if (i * i >= minSQR) {
                if (i * i <= maxSQR) {
                    counterTotal = counterTotal + 1;
                    continue outer;

                }
                return counterTotal;

            }

        }
        return -1;
    }
}