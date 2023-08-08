import java.util.*;
public class bj4_5597 {
    public static void main(String[] args){
        //과제 안내신 분?
        //정원 30명 번호를 무작위로 나열할 떄 과제 안 낸 두 사람의 번호를 순서대로 출력
        Scanner scanner = new Scanner(System.in);
        int[] arry = new int[28];
        int a = 0, b = 0, c = 0, sum = 0, arrysum = 0;
        for(int i = 0; i < arry.length; i++){
            arry[i] = scanner.nextInt();
            arrysum += arry[i];
        }
        for(int i = 1; i <=30; i++){
            sum += i;
        }
        c = sum - arrysum;
        //선택정렬
        for(int i = 0; i < arry.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < arry.length; j++)
                if(arry[min] > arry[j]){
                    min = j;
                }
            int temp = arry[min];
            arry[min] = arry[i];
            arry[i] = temp;
        }

        for(int i =0; i < c/2; i++){
            if(arry[i] != i + 1){
                a = i + 1;
                break;
            }
        }
        System.out.printf("%d\n%d", a,c-a);

    }
}
