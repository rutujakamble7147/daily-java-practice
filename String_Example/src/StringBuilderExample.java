public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("rutuja");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.hashCode());
        StringBuilder stringBuilder2 =  stringBuilder.append(" kamble");
        System.out.println(stringBuilder2.insert(6, ""));
        System.out.println(stringBuilder2.length());
        System.out.println(stringBuilder2.hashCode());
    }



}
