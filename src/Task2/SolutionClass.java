package Task2;

import java.util.List;

        // Napisz metodę int solution(List<Integer> a), która otrzyma listę N liczb całkowitych i zwróci
        // najmniejszą dodatnią wartość (większą niż 0) która NIE występuje na liście.
        // Na przykład:
        // • a = [1, 3, 6, 4, 1, 2], solution = 5
        // • a = [1, 2, 3], solution = 4
        // • a = [-1, -3], solution =1
        // Założenie są następujące:
        // • Lista może mieć dowolną wielkość, ale załóżmy, że algorytm ma obsługiwać poprawnie tylko
        // zainicjalizowane niepuste listy do rozmiaru 1E5 elementów. W innym przypadku odpowiedni wyjątek
        // powinien zostać rzucony.
        // • Każdy element listy jest liczbą całkowitą z przedziału [−1000000..1000000] i może obejmować dowolną
        // ilość powtórzeń.

        // Zaimplementuj własne klasy wyjątków na wypadek nie spełnienia któregoś z wymogów algorytmu. 

public class SolutionClass {

    public static int Solution(List<Integer> a) throws Exception {
        int maxSize= 1000001;
        if(a.size()>1E5) {
            throw new ToBigSizeException();
        }
        int[] tab = new int[maxSize];

        for ( int element: a
             ) {
            if(element>0) {
                if(element>1000000)
                    throw new ToBigValueException();
                tab[element]++;
            }
        }

        for (int i=1; i< maxSize; i++) {
            if (tab[i] == 0)
                return i;
        }
        throw new ElementNotExistsException();
    }
}