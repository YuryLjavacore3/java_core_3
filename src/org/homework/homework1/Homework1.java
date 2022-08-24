package org.homework.homework1;

public class Homework1 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние слова,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!
        String result1 = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(result1.repeat(3));


        //Задача №2
        //Создать переменные с ростом (!в метрах), весом.
        //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
        //Пример результата вывода на экран:
        //21.0
        double height = 1.73;
        double weight = 80;
        double bmi = weight / (height * height);
        String result2 = String.format("%2.1f", bmi).replace(',', '.');
        System.out.println(result2);


        //Задача №3
        //Создать из массива букв a,b,c,d,e, строку,вывести на экран, поменять в массиве 4 букву по счету на h,
        //и снова создать строку, вывести на экран
        char[] array1 = {'a', 'b', 'c', 'd', 'e'};
        String textArray1 = String.valueOf(array1);
        System.out.println(textArray1);
        array1[3] = 'h';
        String textArray2 = String.valueOf(array1);
        System.out.println(textArray2);


        // Домашка
        // Задание №4 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        
        int count = 1;
        for (int i = 1; i <= 100; i++) {
            System.out.print(count + "a ");
            count++;
        }
        System.out.println(newLine);

        // Задание №5
        // Дано:
        int ageChildren = 8;
        // Задача: Написать условную конструкцию, которая в зависимости от возраста ребенка, отправляет его в учебное заведение
        // если ребенку до 6 лет то в сад, если до 11 лет в младшую школу, если до 17 лет в среднюю школу, иначе в университет
        // Отправляет - имеется в виду, печатает на экран: "пошел с сад", "пошел в младшую школу" и т.д.
        // Проверьте работоспособность условий, через изменение значения переменной.

        if (ageChildren < 6) {
            System.out.println("Ребенку " + ageChildren + " лет - идёт в детский сад!");
        } else if (ageChildren <= 10) {
            System.out.println("Ребенку " + ageChildren + " лет - идёт в младшую школу!");
        } else if (ageChildren <= 16 ) {
            System.out.println("Ребенку " + ageChildren + " лет - идёт в среднюю школу!");
        } else {
            System.out.println("Ребенку " + ageChildren + " лет - идёт в университет!");
        }


        //Продвинутый уровень (Для тех, кто имеет опыт или базовая очень простая)
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"

        String text = new String ( "234");
        String text2 = new String ( "some_text");
        int stringToInteger = Integer.parseInt(text);
        System.out.println(stringToInteger + text2.length());


        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int c = 2;
        double d = Math.pow(a + b, c);
        System.out.println(d);

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)

        int[] array2 = {1, 2, 5, 7, 10};
        int[] array3 = {2, 3, 2, 17, 15};
        for (int i = 0; i < 5; i++) {
            System.out.print(array2[i] * array3[i] + " ");
        }
        System.out.println(newLine);


        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов

        String text3 = new String ("Hello world!");
        String text4 = text3.replaceAll("l", "r" );
        String text5 = text4.toUpperCase();
        char[] toCharArray = text5.toCharArray();
        for (int i = 0; i < 8; i++) {
            System.out.print(toCharArray[i]);
        }
        System.out.println(newLine);

        // Задание №5: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        int countIteration = 0;
        while (result <= 1_000_000) {
            if (result < 0) {
                break;
            } else {
                result = result + increment;
                countIteration++;
                if (result > 1_000_000) {
                    System.out.println(countIteration);
                }
            }
        }

        // Задание №6
        // Дано:
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = false;
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному). Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        boolean cesar = chicken && vegetables && sour && toast;
        boolean olivier1 = chicken || sausage;
        boolean olivier2 = vegetables && olivier1 && eggs;
        boolean vegetableSalad = vegetables;
        if (cesar == true) {
            System.out.println("Цезарь готов!");
        } else if (olivier2 == true) {
            System.out.println("Оливье готов!");
        } else if (vegetableSalad == true) {
            System.out.println("Овощной салат готов!");
        } else {
            System.out.println("Невозможно сделать какой либо салат!");
        }
        System.out.println(newLine);

        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> - "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
        String textClientData = new String("<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>" );
        String textClientData2 = new String("<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>");
        String [] arrayTextData = textClientData.split ( ";");
        for (String word: arrayTextData) {
            System.out.println(word);
        }
        if (textClientData.matches("7991113344")) {
            System.out.println("Есть цифры.");
        } else {
            System.out.println("Цифр нет.");
        }

    }
}