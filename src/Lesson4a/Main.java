package Lesson4a;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        arrayList.add("Apple");
        arrayList.add("Orange");
        arrayList.add("Car");
        arrayList.add("Dog");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Mouse");
        arrayList.add("Orange");

        System.out.println(arrayList);
        Collections.sort(arrayList);
        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);

        //единственное, что у меня получилось - это вывести список уникальных слов через HashSet. Никак не получается подсчитать количество повторяющихся
        //Надеюсь, смогу разобраться после объяснения дз на последующих уроках.

// по второму заданию - почти получилось воспроизвести то, что показывали на уроке. Но если выбирать "показать" ( в моем случае - 2) ,
// то показывает список людей  - не поняла почему.
// При создании отдельного класса ругается на цикл while. Поэтому сделала все в main. Так у меня хоть что то получилось. Но не получилось сохранять.
// К сожалению, вся работа только в консоли

        HashMap <String, String> hashMap = new HashMap<>();

       System.out.println("1 - добавить человека, 2 - найти и показать номер, 3 выход");
        HashMap<String, ArrayList<String>> people = new HashMap<>();

        while (true) {
            int answer = sc.nextInt();

            if (answer == 1) {
                String man = sc.nextLine();
                String number = sc.nextLine();
                if (people.get(man) == null) {
                    ArrayList<String> numbers = new ArrayList<>();
                    numbers.add(number);
                    people.put(man, numbers);
                }
                else {
                    people.get(man).add(number);
                }


            } else if (answer == 2) {
                String man = sc.nextLine();
                System.out.println(people.get(man));

            } else if (answer == 3) {
                break;

            }


        }
    }
}
