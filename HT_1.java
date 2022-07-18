//1. Создать карту (Map), будет хранить в себе данные телефонной книги (Фамилии и телефонные номера), 
//если будут дубликаты фамилий, то должны выводиться оба номера (если помним Map не может хранить дубликаты,
//будет заменять номер телефона по ключу, нужно подумать как не допустить такого).

package HT_3;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class HT_1 {
    public static void main(String[] args) {
        TreeMap<String, ArrayList<String>> phone_name = new TreeMap<String, ArrayList<String>>();   
        //Хочу вывод по фамилиям, отсортированным по алфавиту. Вне зависимости от порядка ввода данных
        ArrayList<String> number = new ArrayList<String>();
        number.add("+79602616322");
        number.add("+79817917838");
        phone_name.put("Dmitriev", number);

        number = new ArrayList<String>();
        number.add("+79602578566");
        phone_name.put("Baikov", number);

        number = new ArrayList<String>();
        number.add("+79522406608");
        phone_name.put("Lopukhova", number);

        for (Map.Entry<String, ArrayList<String>> item : phone_name.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
