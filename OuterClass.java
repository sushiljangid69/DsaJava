public class OuterClass<NestedClass,InnerClass>{
    private int id;
    static int count = 10;
    String name;
    OuterClass(String name,String age){
        this.name = name;
        new OuterClass.NestedClass(age);
    }
    OuterClass(){}
    static class NestedClass {
        static String age = "20";

        NestedClass(String age) {
            this.age = age;
        }
        NestedClass(){}
    }
}
class Main1{
    public static void main(String[] args){
        String a = OuterClass.NestedClass.age;
        System.out.println(a);
    }
}
