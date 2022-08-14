package ru.netology.sqr;

public class SQRService {

    public int sqrsInBorders(int a, int b) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (a <= i * i && i * i <= b) {
                count++;
            }
            continue;
        }
        return count;
    }
}
