package replitQuestions;

import java.util.Random;
import java.util.Scanner;

public class isPos {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++){
            arr[i]=inp.nextInt();
        }

        isPos(5);
    }

    public static void isPos(int num){

        if (num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }


    }
}
