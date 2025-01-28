package lang.string.methid;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str="apple,banana,Orange";
        String[] strings=str.split(",");

        for (String string : strings) {
            System.out.println(string);
            
        }


        System.out.println(String.join("-",strings));
    }
}
