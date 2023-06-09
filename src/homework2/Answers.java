package homework2;

public class Answers {
    /*
    1. Как оценивается эффективность алгоритма?
    - времени (операций) и пространства(памяти)
    - при помощи  асимптотического анализа

    2. Что учитывается при асимптотическом анализе?
    - время и память

    3. Перечислите основные правила асимптотического анализа
    - константа не учитывается
    - проихведение функций равна произвендению их сложности: О(n^2)
    - тоже самое и деление
    - сумма функций определяется по самой растущей функции - О(n^3 + n^4) = O(n^4)

    4. Какие порядки роста асимтотических функций знаете?
    - O (1) - константа
    - O(log n) - логорифмическая
    - O(n) - линейная
    - O(n*log n) - линейно-логорифмическая
    - O(n^2) - квадратичная
    - O(!n) -
    5. Оцените сложность по времени и памяти
    - void method(int n) {
        for (int i = 0; i < n / 2; i++) { // O(n/2)
            for (int j = 1; j + n / 2 <= n; j++) { // O(n/2 - 1)
                for (int k = 1; k <= n; k = k * 2) {  // O(log n)
                    System.out.println("I am expert!"); // итог: O(n^3)
                }
            }
        }
    }
    - void method2(int n) {
        for (int i = 1; i <= n; i++) { // O(n)
            for (int j = 1; j <= n; j = j + i) { // O(n) ??
                System.out.println("I am expert!"); // итог: O(n^2)
            }
        }
    }
    - void method3(int a, int b) { // примечание a > 0 и b > 0
        while (a != b) { /1
            if (a > b) { /1
                a = a - b; //2
            } else {
                b = b - a; //2
            } //
        }
    }

        public static void fork(int n) {
		if (n < 5) {
			System.out.println("number < 5");
		} else {
			for (int i = 0; i < n; i++) {
				System.out.println(i + " ");
			}
		}
	}
	В лучшем O(1)
	В худшем O(n)
    */
}
