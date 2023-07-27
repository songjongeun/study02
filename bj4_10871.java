import java.util.*;
public class bj4_10871 {
    public static void main(String[] args){
        // 2. x보다 작은 수. 정수 n개로 이루어진 수열 A와 정수 X 가 주어질 때 A<X 인 숫자를 모두 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //수열의 길이
        int x = sc.nextInt(); // 비교할 수
        int[] arr = new int[n];

        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < x){
                System.out.printf("%d ", arr[i]);
            }
        }

        // for(int i = 0; i < arr.length; i++){
            
        // }
    }
}
