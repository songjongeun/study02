import java.util.*;
import java.io.*;
public class bj4_10810 {
    public static void main(String[] args)throws IOException{
        // 공넣기 Scanner 버전 ----------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // 바구니의 총 갯수(범위)
        // int m = sc.nextInt(); // 공을 넣(or뺏)을 개수
        // int[] basket = new int[n];
        // // i j k -> i~j 는 바구니 범위/ k 는 넣을 공 번호
        // /* 1 2 3 -> 3 3 0 0 0
        //  * 3 4 4 -> 3 3 4 4 0
        //  * 1 4 1 -> 1 1 1 1 0
        //  * 2 2 2 -> 1 2 1 1 0 (최종결과) 
        //  */
        // int i, j, k;
        // for(int l = 0; l < basket.length; l++){
        //     basket[l] = 0;
        //     // System.out.print(basket[l]);
        // }
        // // System.out.print("\n");

        // for(int l = 0; l < m; l++){
        //     i = sc.nextInt();
        //     j = sc.nextInt();
        //     k = sc.nextInt();
        //     for(int o = i - 1; o <= j - 1; o++){ // i~j까지의 범위에
        //         basket[o] = k; // k가 쓰여진 공을 넣음
        //     }
        // } // m번까지 반복
        // for(int l = 0; l < basket.length; l++){
        //     System.out.print(basket[l]+" ");
        // }
        // ==================================================================================
        //공넣기 bufferReder/ Write
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk; //공백으로 구분하기 위해 설정
        tk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(tk.nextToken()); // 바구니 갯수
        int m = Integer.parseInt(tk.nextToken()); // 공을 넣었다 빼는 행위의 수
        int[] basket = new int[n];
        int i, j, k;
        for(int l = 0; l < n; l++){
            basket[l] = 0; // 배열을 0으로 초기화
        }
        System.out.print("\n");
        for(int l = 0; l < m; l++){
            tk = new StringTokenizer(br.readLine());
            i = Integer.parseInt(tk.nextToken());
            j = Integer.parseInt(tk.nextToken());
            k = Integer.parseInt(tk.nextToken());
            for(int o = i - 1; o <= j - 1; o++){
                basket[o] = k;
            }
        }
        for(int l = 0; l < basket.length; l++){
            System.out.print(basket[l]+" ");
        }
    }
}
