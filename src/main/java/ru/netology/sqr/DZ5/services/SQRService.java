package ru.netology.sqr.DZ5.services;

public class SQRService {

    int counterTotal = 0;

    public int squareRoot(int minSQR, int maxSQR) {

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minSQR) {
                if (i * i <= maxSQR) {

                    counterTotal = counterTotal + 1;
                    continue;
                }
                return counterTotal;

            }


        }
        return -1;

    }

}
