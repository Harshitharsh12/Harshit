public class Strings {
    public static void main(String[] args) {
        String s = "Harshhhhhit";
        String s2 = "Harshit";
        String s3 = new String("Harshit");
        String s4 = new String("Kaira");
        String s5 = "Kaira";
        int[] arr = { 1, 2, 3, 4 }; // ---> Behind the scene: int[]arr=new int[4]=>{arre[0]=1 arr[1]=2 arr[2]=3
                                    // arr[3]=4};
        int[] arr2 = { 1, 2, 3, 4 };
        System.out.println(arr == arr2);
        System.out.println(s == s2);
        System.out.println(s == s3);
        System.out.println(s4 == s5);
        String s6 = "H";
        String s7 = "H";
        String s8 = "K";
        String s9 = "Kaira";
        String s10 = "Harshit";
        String s11 = "Harshit";
        String s12 = "KAira";
        System.out.println(s6.compareTo(s7));
        System.out.println(s6.compareTo(s8));
        System.out.println(s8.compareTo(s6));
        System.out.println(s6.compareTo(s8));
        System.out.println(s9.compareTo(s10));
        System.out.println(s11.compareTo(s10));
        System.out.println(s9.compareTo(s12));

        // concat and + difference:
        System.out.println(10 + 20 + s10 + s9);
        System.out.println(s10 + s9 + 10 + 20);
        System.out.println(s10.concat(s9).concat("10").concat("20"));
        System.out.println(("10").concat("20").concat(s10).concat(s9));
        System.out.println(s.valueOf(false));
        s = s.replaceFirst("" + 'h', "" + '1');
        System.out.println(s);
    }
}
