package lang.wrapper;

public class MyIntegerMethodMain0 {
    public static void main(String[] args) {
        int value=10;
        int i1=compareTo(value,5);
        int i2=compareTo(value,10);
        int i3=compareTo(value,15);
        System.out.println("i1="+i1);
        System.out.println("i1="+i2);
        System.out.println("i1="+i3);
    }
    public static int compareTo(int val,int target){
        if(val<target){
            return -1;
        } else if(val>target){
            return 1;
        }else{
            return 0;
        }
    }
}
