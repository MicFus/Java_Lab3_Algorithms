package Task3;

//      3. Napisz metodę int substring(String a, String b) zwracającą ilość razy w jakiej trzeba
//        powtórzyć łańcuch a aby b stało się się podłańcuchem a (zawierało się w nim). Jeżeli B nie może być
//        podłańcuchem a, to zwróć -1.
//        Np. a = "abcd", b="cdabcdab" => 3 ponieważ dopiero trzy powtórzenia łańcucha a dadzą "abcdabcdabcd",
//        który zawiera łańcuch b.

public class SubstringClass {
    public static int Substring(String strA, String strB)throws Exception{

        if(strA.length()>strB.length()){
            throw new Exception("To short value A");
        }

        int[] startPositions = new int[strA.length()];
        int index=-1;

        for(int i=0; i<strA.length();i++) {
            if ((strA.toCharArray())[i] == (strB.toCharArray())[0]) {
                startPositions[++index] = i;
            }
        }

        for(int i=0; i<=index;i++){
            int containAmount=(startPositions[i]==0) ? 0:1;
            boolean isSubstring=true;

            for(int j=0; j<strB.length();j++) {
                if(((strA.toCharArray())[((startPositions[i]+j)%strA.length())])!=(strB.toCharArray())[j]) {
                    isSubstring = false;
                    break;
                }
                if((startPositions[i]+j)%strA.length()==0)
                    containAmount++;
            }
            if(isSubstring){
                return containAmount;
            }
        }
        throw new Exception("String B doesn't contain A");
    }
}