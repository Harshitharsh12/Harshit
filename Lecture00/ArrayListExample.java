import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(10);
        ArrayList<Integer> arrList2 = new ArrayList<Integer>(10);
        Scanner sc = new Scanner(System.in);
        System.out.println(arrList);
        arrList.add(1);
        System.out.println(arrList);
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.add(60);
        arrList.add(70);
        arrList.add(80);
        arrList.add(90);
        arrList.add(100);
        arrList.add(110);
        System.out.println(arrList);
        arrList.remove(3);
        System.out.println(arrList);
        System.out.println(arrList.contains(10));
        System.out.println(arrList.contains(150));
        arrList.set(0, 150);
        System.out.println(arrList);
        // System.out.println(arrList[0]);--> NOt Possible here
        System.out.println(arrList.get(0));
        // add Elements in araylist by using loop:
        for (int i = 0; i < 10; i++) {
            arrList2.add(sc.nextInt());
        }
        // show Elements:
        for (int i = 0; i < 10; i++) {
            System.out.print(arrList2.get(i) + " ");
        }
        System.out.println();
        // or
        System.out.println(arrList2);
        System.out.println("the index of 20 in 'arrList' arraylist is: " + arrList.indexOf(20));
        System.out.println("the arrList ArrayList before addAll  method: " + arrList);
        arrList.addAll(arrList2);
        System.out.println("the arrList ArrayList after addAll  method: " + arrList);
        System.out.println("90 is in the ArrayList: " + arrList.contains(90));
        arrList.remove(0);
        arrList.add(0, 250);
        System.out.println(arrList);
        System.out.println(arrList.size());

    }
}
