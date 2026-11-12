import java.util.Arrays;

public class Lab5_680074 {
    static int [] data = {28, 58, 8, 77, 48, 39};
    static ArrayProcessor q1NumberOfEvenElement;
    static ArrayProcessor q2IndexOfLargestEvenValue;
    static ArrayProcessor myMedian;

    static void q1() {
        q1NumberOfEvenElement = (int [] arr) -> {
            int count = 0;
            for(int num : arr) {
                if(num % 2 == 0) {
                    count++;
                }
            }
        return count;
        };
        System.out.println("q1 : " + q1NumberOfEvenElement.calculate(data));
    }
    static void q2() {
        q2IndexOfLargestEvenValue = (int[] arr) -> {
            int Largest = Integer.MIN_VALUE;
            int index = -1;
            for (int i = 0; i < arr.length;i++){
                if(arr[i] % 2 == 0 && arr[i] > Largest){
                    Largest = arr[i];
                    index = i;
                }
            }
            return index;
        };
        System.out.println("q2 : " + q2IndexOfLargestEvenValue.calculate(data));
    }
    static void oneline() {
        int [] tmp = Arrays.copyOf(data, data.length);
        Arrays.sort(tmp);
        myMedian = (int[] arr) ->{
            int n = arr.length;
            return arr[n / 2];
        };
        System.out.println(myMedian.calculate(tmp));
    }
    public static void main(String[] args) {
        q1();
        q2();
        oneline();
    }
}
