package GLJavaStringMethods;

public class CompareExamples {
    public static void main(String args[]){
        //equals()
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        // == operator
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

        //compareTo()
        String s5="PerSchola";
        String s6="PerScholass";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s5)); // 1(because s1>s5) s vs ''
        System.out.println(s1.compareTo(s6)); // -1(because s1<s6 ) '' vs 's'
    }
}
