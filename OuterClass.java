public class OuterClass<NestedClass>{
    private int id;
    static int count = 10;
    String name;
    OuterClass(String name){
        this.name = name;
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
