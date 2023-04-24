import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        subSet("","abc");
        System.out.println(subSetret("","abc"));

    }
//    p is processed and up is unprocessed
    static void subSet(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);


        subSet(p+ch,up.substring(1));
        subSet(p,up.substring(1));
    }

    static ArrayList<String> subSetret(String p, String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;

        }

        char ch = up.charAt(0);


        ArrayList <String> left =  subSetret(p+ch,up.substring(1));
        ArrayList <String> right =  subSetret(p,up.substring(1));


        left.addAll(right);
        return left;



    }
}