import java.util.*;
public class bj4_10818 {
    public static void main(String[] args){
        //최대 최소 첫째줄 = n 개의 숫자 / 둘째줄 최소와 최대를 공백으로 구분해 출력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 입력할 숫자의 개수
        int min, max, temp; // 최소 최대, 임시값
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        min = arr[0]; // 최소최대 초기화
        max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){ // min의 값보다 arr[i] 가 작으면
                temp = min;
                min = arr[i];
                arr[i] = temp; // 둘의 위치를 바꿈
            }else if(max < arr[i]){ // max의 값보다 arr[i]가 크면
                temp = max;
                max = arr[i];
                arr[i] = max; //둘의 위치를 바꿈
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
