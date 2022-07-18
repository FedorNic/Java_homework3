// 3. Написать программу, показывающую последовательность действий для игры “Ханойская башня”
package HT_3;

public class HT_3 {
    public static void main(String[] args) {
        int Rings = 3; // Количество колец в задаче
        replaceRings('A', 'B', 'C', Rings);
    }

    public static void replaceRings(char a, char b, char c, int count) {

        if (count == 1) {
            System.out.println(String.format("Переставляем из %s в %s", a, b));
            return;
            // При последнем кольце - переносим на итоговое место
        } else {
            replaceRings(a, c, b, count - 1);
            System.out.println(String.format("Переставляем из %s в %s", a, b));
            replaceRings(c, b, a, count - 1);
        }
    }
}