package com.loginpackage;
import java.util.*;

public class kushagra {
    int plan() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int total = 0;

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        if (total < n) {
            return -1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                int flag = 0;

                if (arr[i] >= n) {
                    return i;
                }
                else {
                    for (int j = i + 1; j <=arr[i]+i+1; j++) {
                        int var = arr[i] + arr[j];
                        if (var >= n) {
                            flag = i + 1;
                            break;
                        }
                    }
                }
                if (flag > 0) {
                    return flag;
                }
            }
        }
        return 1;
     }
   public static void main(String[] args) {

        kushagra obj = new kushagra();
        int val = obj.plan();

        System.out.println(val);
    }
}