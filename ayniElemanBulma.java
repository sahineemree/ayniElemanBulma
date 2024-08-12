import java.util.Arrays;
import java.util.Scanner;

public class ayniElemanBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin eleman sayısını giriniz : ");
        int diziBoyutu = input.nextInt();

        int[] list = new int[diziBoyutu];

        for (int i = 0 ; i < diziBoyutu ; i++){
            System.out.print((i+1) + ". elemanı giriniz : ");
            list[i] = input.nextInt();
        }

        Arrays.sort(list);

        for (int i = 0; i < list.length-1; i++) {
            if (list[i] == list[i+1]) {
                int count = 1;
                for (int j = i + 1; j < list.length && list[j] == list[i]; j++) {
                    count++;
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
                i += count;
            }
        }
    }
}