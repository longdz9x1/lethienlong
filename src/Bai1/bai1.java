package bai1;

import java.util.Scanner;

public class bai1 {
   public static void main(String args[])
   {
     int N;
     Scanner nhap= new Scanner(System.in);
     System.out.println("Nhap so N : ");
     N=nhap.nextInt();
     if (N>0)
     {
         if (kiemtra(N)==1)
             System.out.println(N +"  la so nguyen to");
         else
             System.out.println(N +"khong phai so nguyen to");
     }


   }
   public static int kiemtra(int N)
   {
       int dem=0;
       for( int i=1;i<=N;i++)
       {
           if (N%i==0)
               dem++;
       }
       if(dem==2)
           return 1;
       else return 0;

    }
}