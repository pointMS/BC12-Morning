package imperative.hanoiTower;

/*
Дано:
    Даны три стержня. На первом стержне находится несколько дисков сверху вниз по возрастанию размера диска.
    Два другие пустые. Требуется перенести все диски с первого стержня на второй.
    Переносить диски разрешается только по одному.
    Не разрешается класть больший диск на меньший.

Анализ алгоритма:
    © https://site.ada.edu.az/~medv/acm/Docs%20e-olimp/Volume%2040/3936.htm
    Пусть требуется перенести n дисков со стержня А на стержень B при помощи стержня C.
    Воспользуемся следующей рекурсивной схемой:
        перенесем n – 1 дисков со стержня А на стержень C, используя B;
        перенесем диск со стержня А на стержень B;
        перенесем n – 1 дисков со стержня C на стержень B, используя А;

Реализация алгоритма:
       Функция hanoiSolve моделирует перенос дисков
       со стержня from на стержень to, используя дополнительный стержень additional.
*/

public class HanoiTower {
    public static void main(String[] args) {
        int discCount = 3;
        hanoiSolve(discCount, 1, 2, 3);
    }

    static void hanoiSolve(int n, int from, int to, int additional) {
        if (n == 0) return;
        hanoiSolve(n - 1, from, additional, to);
        System.out.println("Перенесите диск со стержня под номером " + from + " на стержень под номером " + to);
        hanoiSolve(n - 1, additional, to, from);
    }

}
