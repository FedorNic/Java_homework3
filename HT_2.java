//2. Написать метод, который проверяет валидность логина и пароля (где нибудь в переменных сохраните) 
//и при помощи конструкции try-catch рекурсивно принимайте данные 
//(нужно ограничить колиичество попыток до 6 и после 3 попытки должно быть сообщение, мол вы привысили количество попыток, 
//немного пододождите тут можете поток заслипить на некоторое время. А когда попытки кончатся - выйти)

package HT_3;

import java.io.IOException;
import java.util.Scanner;

public class HT_2 {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        Valid(count);
    }

    public static void Valid(int num) throws InterruptedException {
        String login = "admin";
        String pass = "qwer";
        try (Scanner sc = new Scanner(System.in)) { // Без обертки в try ругается, что сканер не закрыт..
            try {
                System.out.println("Логин: ");
                String loginCheck = sc.nextLine();
                System.out.println("Пароль: ");
                String passCheck = sc.nextLine();
                if (loginCheck.equals(login) && passCheck.equals(pass)) {
                    System.out.println("Вы успешно вошли в систему!");
                } else {
                    throw new IOException("Логин или пароль не соответствуют");
                }

            } catch (IOException e) {
                System.out.println(e.getMessage());
                switch (num) { // переменная для проверки
                    case 3: // значение переменной для проверки

                        System.out.println("А ты случайно не бот? Подожди 3 секунды, мой железный друг =)");
                        Thread.sleep(3000);
                        break;
                    case 1: // значение переменной для проверки

                        System.out.println("Вход заблокирован!");
                        System.out.println("Ваш копьютер самоуничтожится через..");
                        Thread.sleep(2000);
                        System.out.println("Три..");
                        Thread.sleep(2000);
                        System.out.println("Два..");
                        Thread.sleep(2000);
                        System.out.println("Один..");
                        return;
                }
                Valid(num - 1);
            }
        }
    }
}