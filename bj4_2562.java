import java.util.*;
public class bj4_2562 {
    public static void main(String[] args){
        // 9개의 서로 다른 숫자 중 최대수와 해당 인덱스를 찾아라
        Scanner sc = new Scanner(System.in);
        int index = 0; // 최댓값인덱스
        int max = 0 ; // 최댓값
        int[] arr = new int[9]; // 9개의 값을 가진 배열을 만듬
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(max < arr[i]){
                max = arr[i];
                index = i + 1; //인덱스 = i, 0부터 시작하기 때문에 +1 을 해줌
            }
        }
        System.out.printf("%d\n%d",max,index);
    }
    
}
