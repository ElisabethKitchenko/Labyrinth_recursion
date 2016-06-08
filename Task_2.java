//2. От A до B.
// Даны два целых числа A и В. Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
//  или в порядке убывания в противном случае.
// Ввод: 5 1
// Вывод: 5 4 3 2 1

public class Task_2 {

    static int outPut(int first, int last) {

        System.out.print(first + " ");
        if (first < last)
            return outPut(first + 1, last);

        else if (first > last)
            return outPut(first - 1, last);

        return 0;
    }

    public static void main(String[] args) {
        outPut(5, 1);
    }
}
