package Task4;

//      4. Napisz metode int[] solution (float[] arr, float target)zwracającą indeksy dwóch
//        elementów tablicy arr które sumują się do target.
//        Np.
//        float[] arr = {2, 7, 11, 15};
//       float target = 9;
//        int[] res = solution(arr, target); // [0,1]
//        Jeśli zadanie nie ma rozwiązania należy rzucić wyjątek.
//        Maksymalna ilość punktów będzie przyznana jeśli rozwiązanie będzie posiadało złożoność
//        obliczeniową mniejszą niż
//        ( )

public class SolutionClass {
    public static int[] Solution(float[] arr, float target)throws Exception{
       for(int i=0; i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]+arr[j]==target)
                    return new int[]{i,j};
            }
        }
        throw new Exception("Solution not exists");
    }
}