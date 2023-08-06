import java.io.*;
import java.util.*;
public class bj4_10811 {
    // public static void main(String[] args){
    //     //바구니 뒤집기_ Scanner 버전
    //     //일정 범위내의 바구니의 순서 뒤집기
    //     /* 
    //      5 4 (바구니의 총 범위 / 바구니 바꿀 횟수)
    //      1 2
    //      3 4
    //      1 4
    //      2 2
    //      >> 3 4 1 2 5
    //      */
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     int m = sc.nextInt();
    //     int[] basket = new int[n];
    //     for(int k = 0; k < n; k++){
    //         basket[k] = k + 1; // 바구니의 인덱스 순서대로 1~n까지 입력
    //     }
    //     for(int k = 0; k < m; k++){
    //         int i = sc.nextInt();
    //         int j = sc.nextInt();
    //         for(int l = j; l >= i; l--){ // j부터 i까지 인덱스를 낮추면서
    //             for(int q = i; q <= j; q++){ //i는 j까지 인덱스를 높이면서
    //                 int temp = basket[l -1]; // 바구니의 숫자를 뒤집음
    //                 basket[l - 1] = basket[q -1];
    //                 basket[q - 1] = temp;
    //             }
    //         }
    //     }
    //     for(int k = 0; k < n; k++){
    //         System.out.print(basket[k] + " "); // 출력
    //     }
    // }
//-------------------------------------------------------------------------------
// -------------BufferReader version
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] basket = new int[n];
        for(int k = 0; k < n; k++){
            basket[k] = k + 1;
        }

        for(int k = 0; k < m; k++){
            st = new StringTokenizer(br.readLine());   
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            for(int l = j; l >= i; l--){
                for(int q = i; q <= j; q++){
                    int temp = basket[l - 1];
                    basket[l - 1] = basket[q -1];
                    basket[q -1] = temp;
                }
            }
        }
        
        for(int k =0; k < n; k++){
            System.out.print(basket[k] + " ");
        }
    }
    
}
