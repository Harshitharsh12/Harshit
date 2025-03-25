public class StringBuilder1 {
    public static void main(String[] args) {
        // StringBuilder sb=new StringBuilder();
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.reverse());
        sb.ensureCapacity(100);
        sb.append("cats");
        sb.append("cats");
        sb.append("cats");
        sb.append("cats");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb);
        System.out.println(sb.reverse());
        // System.out.println(sb.de)

    }
}
