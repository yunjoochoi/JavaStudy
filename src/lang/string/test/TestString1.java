package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url="https://www.example.com";
        System.out.println("https://로 시작하는가: "+url.startsWith("https://"));

        String[] arr={"hello","java","jvm","spring","jpa"};
        int sum=0;
        for (String string : arr) {
            sum+=string.length();
            System.out.println(String.format("%s:%d",string,string.length()));
        }
        System.out.println("sum: "+sum);


        String str="hello.txt";
        System.out.println("index: "+str.indexOf(".txt"));
        System.out.println("fileName:"+str.substring(0,5));
        System.out.println("extName:"+str.substring(5,str.length()));


        System.out.println("fileName:"+str.substring(0,str.indexOf(".")));
        System.out.println("extName:"+str.substring(str.indexOf(".")));

        String str2="hello java hello world hello peaple";
        String key="hello";
        int cnt=0;
        int idx=str2.indexOf(key);
        while(idx>=0){
            cnt+=1;
            idx=str2.indexOf(key,idx+1);
        }
        System.out.println("cnt: "+cnt);

        String original="      Helllo Java      ";
        System.out.println(original.strip());
        System.out.println(original.replace("Java","Helo").strip());

        String email="casidfds@naver.com";

        System.out.println("id: "+email.substring(0,email.indexOf("@")));
        System.out.println("domain: "+email.substring(email.indexOf("@")+1));

        String[] parts=email.split("@");
        System.out.println("id: "+parts[0]);
        System.out.println("domain: "+parts[1]);


        String fruits="banana,apple,mango";
        String[] bucket=fruits.split(",");
        for (String string : bucket) {
            System.out.println(string);
        }
        String joinedString=String.join("->",bucket);
        System.out.println(joinedString);

        String strr="hello Java!";
        strr=new StringBuilder(strr).reverse().toString();
        System.out.println(strr);
    }
}
