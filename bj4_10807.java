import java.util.*;
public class bj4_10807 {
    public static void main(String[] args){
        // 1. 총 n개의 정수가 주어졌을 떄, 정수 v가 몇 개인지 구하는 프로그램
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 정수의 갯수 입력
        int[] arr = new int[n];
        int count = 0;

        for(int i = 0; i < arr.length; i++){ //arr배열에 arr의 길이만큼 반복해서 배열 만들기
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt(); // 찾을 숫자 입력

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == v){
                count++;
            }
        }
        System.out.println(count);

    }
    
}
