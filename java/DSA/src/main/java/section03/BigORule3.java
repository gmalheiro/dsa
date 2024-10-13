package section03;

import java.util.List;
//Different terms for inputs
public class BigORule3 {

    public static void compressBoxesTwice(List<String> boxes) {
        for (String box : boxes) {
            System.out.println(box);
        }

        for (String box : boxes) {
            System.out.println(box);
        }
    }

    public static void compressBoxesTwice2(List<String> boxes1, List<String> boxes2) {
        for (String box : boxes1) {
            System.out.println(box);
        }

        for (String box : boxes2) {
            System.out.println(box);
        }
    }

    public static void main(String[] args) {
        /*
         The first function big O is o(n) because its iterating through the same array
         The second function big o is o(n + m) because they are iterating through a different array
        */

        List<String> boxes1 = List.of("Box1", "Box2", "Box3");
        List<String> boxes2 = List.of("BoxA", "BoxB", "BoxC");
        compressBoxesTwice(boxes1);
        compressBoxesTwice2(boxes1, boxes2);
    }
}
