package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr={-1,0,1,2,3};
        System.out.println(findValue(intArr,-1));

    }
    private static int findValue(int[] arr,int value){
        for (int i : arr) {
            if(i==value){
                return value;
            }
        }
        return -1;
    }
}
