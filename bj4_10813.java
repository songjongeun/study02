import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class bj4_10813 {
    //------------------------------scanner 방법------------------------------------
    // public static void main(String[] args){
    //     //바구니 공 바꾸기 
    //     //1~n개의 바구니, 바구니에 숫자가 순서대로 적혀 있고, 바구나에 적힌 숫자의 공들이 들어있음.
    //     //m번 공을 바꿈, i와 j번 바구니의 공들을 서로 바꾸고 m번을 할 때 바구니에 있는 공의 숫자를 바구니 순서대로 나열할 것
    //     /*예시입력
    //      * 5 4
    //      * 1 2
    //      * 3 4
    //      * 1 4
    //      * 2 2
    //      * >> 3 1 4 2 5
    //     */
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt(); //바구니 범위
    //     int m = sc.nextInt(); //행위의 수
    //     int[] basket = new int[n]; // 바구니 배열
        
    //     for(int i = 0; i < n; i++){
    //         basket[i] = i + 1; //바구니 배열안에 공의 수를 초기화 (순서대로 1~n까지 공 넣기)
    //     }

    //     for(int k = 0; k < m; k++){// m 번의 행위를 하는 동안
    //         int i = sc.nextInt(); // 공을 바꿀 두 개의 공을 정하고
    //         int j = sc.nextInt();
    //         // 두개 바구니의 공을 서로 바꿈
    //         int temp = basket[i - 1];
    //         basket[i - 1] = basket[j - 1];
    //         basket[j - 1] = temp;
    //         //인덱스가 0 부터 시작하기 때문에 인덱스 번호에 맞는 공의 번호를 하기 위해 i와 j에 1씩 뺌
    //     }

    //     for(int i = 0; i < n; i++){ 
    //         System.out.print(basket[i] + " "); //바구니 순서대로 공의 번호 출력
    //     }
    // }
    //-------------------------------------------------------------------
    // Buffer버전
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine()); // 공백 입력을 위해 StringTokenizer 설정
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        for(int i = 0; i < n; i++){
            basket[i] = i + 1;
        }

        for(int k = 0; k < m; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1; // index = 0부터 시작하므로 index를 맞추기 위해 -1
            int j = Integer.parseInt(st.nextToken()) - 1;
            int temp = basket[i];
            basket[i] = basket [j];
            basket[j] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(basket[i]+ " ");
        }
    }
}
