import java.util.Arrays;

public class ArrayTester {
    public static void main(String[] args){
        int decider;
        try {
            decider = Integer.valueOf(args[0]);
        }
        catch(Exception e){
            decider = 3;
        }
        if(decider ==1){
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 1}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 2}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 2, 1}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 1, 2}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 2, 2}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 3, 2, 1, 2}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 1, 2, 1}));
            System.out.println(ArrayAlgorithms.repetitions(new int[] {1, 1, 2, 1, 3, 2, 4, 3}));
        }
        if(decider ==2){
            int[] testA = {1, 2, 3, 4, 5};
            int[] result = ArrayAlgorithms.shiftRight(testA, 1);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1, 2, 3, 4, 5};
            result = ArrayAlgorithms.shiftRight(testA, 3);
            ArrayAlgorithms.shiftRight(testA, 3);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1, 2, 3, 4, 5};
            result = ArrayAlgorithms.shiftRight(testA, 5);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1, 2, 3, 4, 5};
            result = ArrayAlgorithms.shiftRight(testA, 7);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1, 2};
            result = ArrayAlgorithms.shiftRight(testA, 1);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1};
            result = ArrayAlgorithms.shiftRight(testA, 3);
            System.out.println(Arrays.toString(result));
            testA = new int[] {1, 2, 3, 4};
            result = ArrayAlgorithms.shiftRight(testA, 2);
            System.out.println(Arrays.toString(result));
        }
        if(decider ==3){
            int[] testA = {1, 2, 3, 4, 5};
            ArrayAlgorithms.shiftRightInPlace(testA, 1);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1, 2, 3, 4, 5};
            ArrayAlgorithms.shiftRightInPlace(testA, 3);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1, 2, 3, 4, 5};
            ArrayAlgorithms.shiftRightInPlace(testA, 5);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1, 2, 3, 4, 5};
            ArrayAlgorithms.shiftRightInPlace(testA, 7);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1, 2};
            ArrayAlgorithms.shiftRightInPlace(testA, 1);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1};
            ArrayAlgorithms.shiftRightInPlace(testA, 3);
            System.out.println(Arrays.toString(testA));
            testA = new int[] {1, 2, 3, 4};
            ArrayAlgorithms.shiftRightInPlace(testA, 2);
            System.out.println(Arrays.toString(testA));

        }
    }
}
